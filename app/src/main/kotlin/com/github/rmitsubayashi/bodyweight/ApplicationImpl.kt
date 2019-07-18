package com.github.rmitsubayashi.bodyweight

import android.app.Application
import com.github.rmitsubayashi.bodyweight.di.shopModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ApplicationImpl: Application(){
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationImpl)
            modules(shopModule)
        }
    }
}