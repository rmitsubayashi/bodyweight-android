package com.github.rmitsubayashi.features.shop_presenter

import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

internal class ShopPresenterImpl: ShopPresenter {
    override fun getShopViewState(exerciseProducts: List<ExerciseProduct>): ShopViewState {
        return ShopViewState(
            ShopItemViewState(true, "Exercises1", "", 100, 10),
            ShopItemViewState(true, "Exercises2", "", 100, 10),
            ShopItemViewState(true, "Exercises3", "", 50, 5),
            ShopItemViewState(true, "Exercises4", "", 100, 10),
            ShopItemViewState(true, "Exercises5", "", 100, 10),
            ShopItemViewState(true, "Exercises6", "", 1000, 100)
        )
    }

    override fun test(testInt: Int): Int {
        return testInt + 20
    }
}