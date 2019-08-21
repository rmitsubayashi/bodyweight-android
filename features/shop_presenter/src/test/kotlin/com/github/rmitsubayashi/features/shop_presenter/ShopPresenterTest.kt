package com.github.rmitsubayashi.features.shop_presenter

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ShopPresenterTest {
    private lateinit var classUnderTest: ShopPresenter

    @Before
    fun setup() {
        classUnderTest = ShopPresenterImpl()
    }

    @Test
    fun test() {
        val testInt = 1
        val result = classUnderTest.test(testInt)
        assertEquals(testInt+20, result)
    }

}