package com.github.rmitsubayashi.features.shop_presenter

import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

interface ShopPresenter {
    fun getShopViewState(exerciseProducts: List<ExerciseProduct>): ShopViewState
    fun test(testInt: Int): Int
}