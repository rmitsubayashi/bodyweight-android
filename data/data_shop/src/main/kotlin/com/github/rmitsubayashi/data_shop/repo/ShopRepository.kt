package com.github.rmitsubayashi.data_shop.repo

import com.github.rmitsubayashi.data_shop.entity.ExerciseProduct

interface ShopRepository {
    suspend fun getExerciseProducts(): List<ExerciseProduct>
    suspend fun postExerciseProducts()
    suspend fun test(): Int
}