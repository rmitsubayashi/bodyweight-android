package com.github.rmitsubayashi.data_shop.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LocalExerciseProductExerciseDao  {
    @Query("SELECT * FROM exercise_product_exercise WHERE product_id = :productID")
    suspend fun getExerciseProductExercises(productID: Int): List<LocalExerciseProductExercise>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExerciseProductExercises(exercises: List<LocalExerciseProductExercise>)
}