package com.github.rmitsubayashi.shop_data.entity

data class ExerciseProduct (
    val title: String,
    val categoryID: Int,
    val exercises: List<Exercise>,
    val price: Int,
    val sold: Boolean
)