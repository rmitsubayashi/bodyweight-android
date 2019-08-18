package com.github.rmitsubayashi.shop_data

import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

interface ShopRepository {
    suspend fun getExerciseProducts(): List<ExerciseProduct>
    suspend fun postExerciseProducts()
    suspend fun test(): Int
}