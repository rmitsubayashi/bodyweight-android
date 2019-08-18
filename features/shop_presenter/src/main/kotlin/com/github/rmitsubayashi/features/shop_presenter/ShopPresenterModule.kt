package com.github.rmitsubayashi.features.shop_presenter

import org.koin.dsl.module

val shopPresenterModule = module {
    factory<ShopPresenter> { ShopPresenterImpl() }
}