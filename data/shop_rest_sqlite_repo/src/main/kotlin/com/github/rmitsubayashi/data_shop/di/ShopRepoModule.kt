package com.github.rmitsubayashi.data_shop.di

import com.github.rmitsubayashi.data_shop.repo.ShopRestSqliteRepository
import com.github.rmitsubayashi.shop_data.ShopRepository
import org.koin.dsl.module

val shopRepoModule = module {
    single<ShopRepository> { ShopRestSqliteRepository() }
}