package com.github.rmitsubayashi.bodyweight.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.github.rmitsubayashi.data_shop.repo.ShopRepository

internal class ShopViewModel(private val shopRepo: ShopRepository): ViewModel() {
    fun getShop(): LiveData<Int> = liveData {
        val data = shopRepo.test()
        emit(data)
    }
}