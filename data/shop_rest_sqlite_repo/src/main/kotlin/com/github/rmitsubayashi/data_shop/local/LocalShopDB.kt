package com.github.rmitsubayashi.data_shop.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        LocalExerciseProduct::class,
        LocalExerciseProductExercise::class
    ],
    version = 1
)
abstract class LocalShopDB: RoomDatabase() {
    abstract fun exerciseProductDao(): LocalExerciseProductDao
    abstract fun exerciseProductExerciseDao(): LocalExerciseProductExerciseDao
}