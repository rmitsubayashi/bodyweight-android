package com.github.rmitsubayashi.bodyweight

import android.app.Application
import com.github.rmitsubayashi.bodyweight.di.shopModules
import com.github.rmitsubayashi.bodyweight.exerciselist.di.exerciseListModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ApplicationImpl: Application(){
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationImpl)
            //many features use the same repo module so remove duplicates (or Koin crashes)
            modules(listOf(shopModules, exerciseListModules).flatten().distinct())
        }
    }
}