package com.github.rmitsubayashi.data_shop.api

import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct
import retrofit2.http.GET
import retrofit2.http.POST

interface ShopService {
    @GET("/shop/exercises")
    suspend fun getExerciseProducts(): List<ExerciseProduct>

    @POST("/shop/exercises")
    suspend fun postExerciseProduct(
        exerciseProduct: ExerciseProduct
    )
}