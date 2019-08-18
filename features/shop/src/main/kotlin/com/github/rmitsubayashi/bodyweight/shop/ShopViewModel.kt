package com.github.rmitsubayashi.bodyweight.shop

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.github.rmitsubayashi.features.shop_presenter.ShopPresenter
import com.github.rmitsubayashi.shop_data.ShopRepository

internal class ShopViewModel(private val shopRepo: ShopRepository, private val shopPresenter: ShopPresenter): ViewModel() {
    fun getShop(): LiveData<Int> = liveData {
        val data = shopRepo.test()
        val presenterData = shopPresenter.test(data)
        emit(presenterData)
    }
}