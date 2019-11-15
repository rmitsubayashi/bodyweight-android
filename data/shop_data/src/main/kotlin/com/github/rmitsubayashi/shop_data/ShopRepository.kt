package com.github.rmitsubayashi.shop_data

import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

interface ShopRepository {
    suspend fun getExerciseProducts(): List<ExerciseProduct>
    suspend fun postExerciseProducts(exerciseProducts: List<ExerciseProduct>)
    suspend fun test(): Int
    fun scheduleDailyFetchExerciseProducts()
}