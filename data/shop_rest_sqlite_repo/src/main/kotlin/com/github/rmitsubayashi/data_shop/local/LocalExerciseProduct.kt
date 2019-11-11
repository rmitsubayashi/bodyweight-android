package com.github.rmitsubayashi.data_shop.local

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation

@Entity(
    tableName = "exercise_product",
    primaryKeys = ["category_id"]
)
data class LocalExerciseProduct (
    @ColumnInfo(name = "category_id") val categoryID: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "price") val price: Int,
    @ColumnInfo(name = "sold") val sold: Boolean
)