package com.github.rmitsubayashi.bodyweight.di

import com.github.rmitsubayashi.bodyweight.shop.ShopViewModel
import com.github.rmitsubayashi.data_shop.di.shopRepoModule
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val shopModule = module {
    viewModel { ShopViewModel(get()) }
}

val shopModules = listOf(shopModule, shopRepoModule)