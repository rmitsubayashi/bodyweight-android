package com.github.rmitsubayashi.data_shop.repo

import com.github.rmitsubayashi.shop_data.ShopRepository
import com.github.rmitsubayashi.shop_data.entity.Exercise
import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

internal class ShopRestSqliteRepository: ShopRepository {
    override suspend fun getExerciseProducts(): List<ExerciseProduct> {
        return listOf(
            ExerciseProduct(
                "test1",
                listOf(
                    Exercise(1, "exercise 1", 1,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test2",
                listOf(
                    Exercise(2, "exercise 2", 2,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test3",
                listOf(
                    Exercise(3, "exercise 3", 3,2, 1)
                ),
                10,
                false
            ),
            ExerciseProduct(
                "test4",
                listOf(
                    Exercise(4, "exercise 4", 4,1, 10)
                ),
                200,
                false
            ),
            ExerciseProduct(
                "test5",
                listOf(
                    Exercise(5, "exercise 5", 5,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test6",
                listOf(
                    Exercise(6, "exercise 6", 6,1, 5)
                ),
                100,
                false
            )
        )
    }

    override suspend fun postExerciseProducts() {
        return
    }

    override suspend fun test(): Int {
        Thread.sleep(1000)
        return 1
    }
}