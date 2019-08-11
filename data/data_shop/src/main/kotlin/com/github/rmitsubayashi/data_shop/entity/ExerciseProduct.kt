package com.github.rmitsubayashi.data_shop.entity

data class ExerciseProduct (
    val title: String,
    val exercises: List<Exercise>,
    val price: Int,
    val sold: Boolean
)