package com.github.rmitsubayashi.data_shop.repo

import com.github.rmitsubayashi.data_shop.local.*
import com.github.rmitsubayashi.shop_data.ShopRepository
import com.github.rmitsubayashi.shop_data.entity.Exercise
import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

internal class ShopRestSqliteRepository(
    private val exerciseProductDao: LocalExerciseProductDao, private val exerciseProductExerciseDao: LocalExerciseProductExerciseDao
): ShopRepository {
    override suspend fun getExerciseProducts(): List<ExerciseProduct> {
        val localProducts = exerciseProductDao.getExerciseProducts()
        return localProducts.map {
            val localProductExercises = exerciseProductExerciseDao.getExerciseProductExercises(it.categoryID)
            convertFromLocalExerciseProduct(it, localProductExercises)
        }
    }

    override suspend fun postExerciseProducts(exerciseProducts: List<ExerciseProduct>) {
        exerciseProductDao.clear()
        val localExerciseProducts = exerciseProducts.map { convertToLocalExerciseProduct(it) }
        exerciseProductDao.insertExerciseProducts(localExerciseProducts)
        val localExerciseProductExercisesList: List<List<LocalExerciseProductExercise>> =
            exerciseProducts.map { convertToLocalExerciseProductExercises(it) }
        val localExerciseProductExercises: List<LocalExerciseProductExercise> =
            localExerciseProductExercisesList.flatten()
        exerciseProductExerciseDao.insertExerciseProductExercises(localExerciseProductExercises)
    }

    override suspend fun test(): Int {
        Thread.sleep(1000)
        return 1
    }
}