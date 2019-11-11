package com.github.rmitsubayashi.data_shop.local

import androidx.room.*

@Entity(
    tableName = "exercise_product_exercise",
    primaryKeys = ["exercise_id"],
    foreignKeys = arrayOf(ForeignKey(
        entity = LocalExerciseProduct::class,
        parentColumns = arrayOf("category_id"),
        childColumns = arrayOf("product_id"),
        onDelete = ForeignKey.CASCADE
    ))

)
data class LocalExerciseProductExercise (
    @ColumnInfo(name = "exercise_id") val exerciseID: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "level") val level: Int,
    @ColumnInfo(name = "quantity") val quantity: Int,
    @ColumnInfo(name = "product_id") val productID: Int?
)