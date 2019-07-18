package com.github.rmitsubayashi.bodyweight.di

import com.github.rmitsubayashi.bodyweight.shop.ShopViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val shopModule = module {
    viewModel { ShopViewModel() }
}