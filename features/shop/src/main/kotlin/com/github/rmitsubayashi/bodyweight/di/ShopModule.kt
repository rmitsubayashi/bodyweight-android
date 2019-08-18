package com.github.rmitsubayashi.bodyweight.di

import com.github.rmitsubayashi.bodyweight.shop.ShopViewModel
import com.github.rmitsubayashi.data_shop.di.shopRepoModule
import com.github.rmitsubayashi.features.shop_presenter.shopPresenterModule
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val shopModule = module {
    viewModel { ShopViewModel(get(), get()) }
}

val shopModules = listOf(shopModule, shopRepoModule, shopPresenterModule)