package com.github.rmitsubayashi.shop_data.entity

data class Exercise (
    val id: Int,
    val title: String,
    val categoryID: Int,
    val level: Int,
    val quantity: Int
)