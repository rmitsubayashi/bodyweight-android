package com.github.rmitsubayashi.bodyweight.exerciselist.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.github.rmitsubayashi.shop_data.ShopRepository

class ExerciseListViewModel(private val shopRepository: ShopRepository): ViewModel() {
    fun test(): LiveData<Int> {
        return liveData {
            val data = shopRepository.test()
            emit(data)
        }
    }
}