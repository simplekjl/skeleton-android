package com.example.domain.base.usecase

import com.example.domain.base.exception.Failure
import com.example.domain.base.executor.PostExecutionThread
import com.example.domain.base.executor.ThreadExecutor
import com.example.domain.base.functional.Either
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers


/**
 * @author Aldyaz Nugroho on 01/06/20.
 * https://github.com/aldyaz
 */
abstract class RxObservableUseCase<in Param, Result> constructor(
    private val threadExecutor: ThreadExecutor,
    private val postExecutionThread: PostExecutionThread
) {

    private val compositeDisposable by lazy { CompositeDisposable() }

    abstract fun createSingle(param: Param): Observable<Either<Failure, Result>>

    fun execute(param: Param, subscriber: DisposableObserver<Either<Failure, Result>>) =
        compose {
            Observable.defer { createSingle(param) }
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.scheduler)
                .subscribeWith(subscriber)
        }

    fun dispose() {
        compositeDisposable.dispose()
    }

    private fun compose(action: () -> Disposable) = compositeDisposable.add(action())

}