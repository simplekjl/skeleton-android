package com.example.app.di

import android.content.Context
import com.example.app.MainApplication
import com.example.app.base.executor.UiThreadExecutionThread
import com.example.data.executor.IoJobExecutor
import com.example.domain.base.executor.PostExecutionThread
import com.example.domain.base.executor.ThreadExecutor
import dagger.Binds
import dagger.Module


/**
 * @author Aldyaz Nugroho on 29/04/20.
 * https://github.com/aldyaz
 */
@Module
abstract class MainModule {
    @Binds
    internal abstract fun bindApplicationContext(application: MainApplication): Context

    @Binds
    internal abstract fun bindThreadExecutor(executor: IoJobExecutor): ThreadExecutor

    @Binds
    internal abstract fun bindPostExecutionThread(postExecutionThread: UiThreadExecutionThread): PostExecutionThread
}