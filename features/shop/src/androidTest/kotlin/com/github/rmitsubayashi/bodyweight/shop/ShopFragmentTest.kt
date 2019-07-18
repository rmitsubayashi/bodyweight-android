package com.github.rmitsubayashi.bodyweight.shop

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.mitsubayashi.bodyweight.shop.R
import com.github.rmitsubayashi.bodyweight.di.shopModule
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.core.context.startKoin

@RunWith(AndroidJUnit4::class)
class ShopFragmentTest {
    @Before
    fun before() {
        startKoin {
            modules(shopModule)
        }
    }

    @Test
    fun launchFragment() {
        FragmentScenario.launchInContainer(ShopFragment::class.java)

        onView(withId(R.id.test)).check(matches(withText("1")))
    }
}