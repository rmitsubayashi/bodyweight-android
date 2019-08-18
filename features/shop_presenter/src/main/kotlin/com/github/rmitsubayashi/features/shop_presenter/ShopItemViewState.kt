package com.github.rmitsubayashi.features.shop_presenter

data class ShopItemViewState(
    val isEnabled: Boolean,
    val title: String,
    val imageURL: String,
    val price: Int,
    val quantity: Int
)