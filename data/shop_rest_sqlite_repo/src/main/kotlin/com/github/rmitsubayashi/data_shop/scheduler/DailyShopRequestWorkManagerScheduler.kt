package com.github.rmitsubayashi.data_shop.scheduler

import android.content.Context
import androidx.work.*
import com.github.rmitsubayashi.shop_data.DailyShopRequestScheduler
import com.github.rmitsubayashi.shop_data.ShopRepository
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.util.concurrent.TimeUnit

class DailyShopRequestWorkManagerScheduler(context: Context): DailyShopRequestScheduler {
    private val applicationContext: Context = context.applicationContext

    override fun schedule() {
        val constraint = Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()
        val work = PeriodicWorkRequestBuilder<FetchAndSaveWorker>(1, TimeUnit.DAYS)
            .setConstraints(constraint)
            .build()

        val workManager = WorkManager.getInstance(applicationContext)
        workManager.enqueueUniquePeriodicWork(FetchAndSaveWorker.WORK_NAME, ExistingPeriodicWorkPolicy.KEEP, work)
    }
}

class FetchAndSaveWorker(appContext: Context, workerParams: WorkerParameters): CoroutineWorker(appContext, workerParams), KoinComponent {
    override suspend fun doWork(): Result {
        val shopRepo: ShopRepository by inject()
        //fetch from api
        //save
        shopRepo.postExerciseProducts(emptyList())

        return Result.success()
    }

    companion object {
        const val WORK_NAME = "fetch_and_save"
    }
}