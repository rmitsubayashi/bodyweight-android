package com.github.rmitsubayashi.data_shop.di

import com.github.rmitsubayashi.data_shop.repo.ShopRepository
import com.github.rmitsubayashi.data_shop.repo.ShopRepositoryImpl
import org.koin.dsl.module

val shopRepoModule = module {
    single<ShopRepository> { ShopRepositoryImpl() }
}