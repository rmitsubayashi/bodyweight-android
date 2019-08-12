package com.github.rmitsubayashi.bodyweight.shop

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.github.rmitsubayashi.data_shop.repo.ShopRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class ShopViewModelTest {
    private lateinit var classUnderTest: ShopViewModel
    @MockK
    lateinit var shopRepository: ShopRepository

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @get:Rule
    val coroutinesTestRule = CoroutinesTestRule()

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        classUnderTest = ShopViewModel(shopRepository)
    }

    @Test
    fun test() {
        coEvery { shopRepository.test() } returns 1
        val result = classUnderTest.getShop()
        result.observeForever {  }
        assert(result.value == 1)

    }
}