package com.github.rmitsubayashi.data_shop.local

import androidx.room.*

@Dao
interface LocalExerciseProductDao {
    @Query("SELECT * FROM exercise_product")
    suspend fun getExerciseProducts(): List<LocalExerciseProduct>

    @Query("DELETE FROM exercise_product")
    suspend fun clear()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExerciseProducts(products: List<LocalExerciseProduct>)

    @Update
    suspend fun updateExerciseProduct(product: LocalExerciseProduct)
}