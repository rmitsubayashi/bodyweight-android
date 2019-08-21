package com.github.rmitsubayashi.bodyweight.shop

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.github.rmitsubayashi.features.shop_presenter.ShopPresenter
import com.github.rmitsubayashi.shop_data.ShopRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.every
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ShopViewModelTest {
    private lateinit var classUnderTest: ShopViewModel
    @MockK
    lateinit var shopRepository: ShopRepository
    @MockK
    lateinit var shopPresenter: ShopPresenter

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @get:Rule
    val coroutinesTestRule = CoroutinesTestRule()

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        classUnderTest = ShopViewModel(shopRepository, shopPresenter)
    }

    @Test
    fun test() {
        val repoResult = 2
        coEvery { shopRepository.test() } returns repoResult
        val presenterResult = 4
        every { shopPresenter.test(repoResult) } returns presenterResult
        val result = classUnderTest.getShop()
        result.observeForever {  }
        assert(result.value == presenterResult)

    }
}