package com.example.domain.base.usecase

import com.example.domain.base.executor.PostExecutionThread
import com.example.domain.base.executor.ThreadExecutor
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.schedulers.Schedulers


/**
 * @author Aldyaz Nugroho on 01/06/20.
 * https://github.com/aldyaz
 */
abstract class RxCompletableUseCase<in Param>(
    private val threadExecutor: ThreadExecutor,
    private val postExecutionThread: PostExecutionThread
) {

    private val compositeDisposable by lazy { CompositeDisposable() }

    abstract fun createCompletable(param: Param): Completable

    fun execute(param: Param, subscriber: DisposableCompletableObserver) = compose {
        createCompletable(param)
            .subscribeOn(Schedulers.from(threadExecutor))
            .observeOn(postExecutionThread.scheduler)
            .subscribeWith(subscriber)
    }

    private fun compose(action: () -> Disposable) = compositeDisposable.add(action())

}