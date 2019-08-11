package com.github.rmitsubayashi.data_shop.entity

data class Exercise (
    val id: Int,
    val title: String,
    val categoryID: Int,
    val level: Int,
    val quantity: Int
)