package com.github.rmitsubayashi.bodyweight.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.github.rmitsubayashi.features.shop_presenter.ShopPresenter
import com.github.rmitsubayashi.features.shop_presenter.ShopViewState
import com.github.rmitsubayashi.shop_data.ShopRepository
import com.github.rmitsubayashi.shop_data.entity.Exercise
import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

internal class ShopViewModel(
    private val shopRepo: ShopRepository,
    private val shopPresenter: ShopPresenter
): ViewModel() {
    fun loadShop(): LiveData<ShopViewState> = liveData {
        shopRepo.postExerciseProducts(mockExerciseProducts)
        val exerciseProducts = shopRepo.getExerciseProducts()
        emit(shopPresenter.getShopViewState(exerciseProducts))
        shopRepo.scheduleDailyFetchExerciseProducts()
    }

    private val mockExerciseProducts =
        listOf(
            ExerciseProduct(
                "test1",
                1,
                listOf(
                    Exercise(1, "exercise 1", 1,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test2",
                2,
                listOf(
                    Exercise(2, "exercise 2", 2,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test3",
                3,
                listOf(
                    Exercise(3, "exercise 3", 3,2, 1)
                ),
                10,
                false
            ),
            ExerciseProduct(
                "test4",
                4,
                listOf(
                    Exercise(4, "exercise 4", 4,1, 10)
                ),
                200,
                false
            ),
            ExerciseProduct(
                "test5",
                5,
                listOf(
                    Exercise(5, "exercise 5", 5,1, 5)
                ),
                100,
                false
            ),
            ExerciseProduct(
                "test6",
                6,
                listOf(
                    Exercise(6, "exercise 6", 6,1, 5)
                ),
                100,
                false
            )
        )
}