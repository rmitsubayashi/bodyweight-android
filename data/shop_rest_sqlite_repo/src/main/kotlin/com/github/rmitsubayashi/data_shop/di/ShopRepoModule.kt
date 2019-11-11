package com.github.rmitsubayashi.data_shop.di

import androidx.room.Room
import com.github.rmitsubayashi.data_shop.local.LocalShopDB
import com.github.rmitsubayashi.data_shop.repo.ShopRestSqliteRepository
import com.github.rmitsubayashi.shop_data.ShopRepository
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val shopRepoModule = module {
    single<ShopRepository> { ShopRestSqliteRepository(get<LocalShopDB>().exerciseProductDao(), get<LocalShopDB>().exerciseProductExerciseDao()) }
    single {
        Room.databaseBuilder(androidApplication(), LocalShopDB::class.java, "shop.db")
            .build()
    }
}