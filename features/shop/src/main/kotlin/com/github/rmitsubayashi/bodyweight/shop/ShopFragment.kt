package com.github.rmitsubayashi.bodyweight.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.github.mitsubayashi.bodyweight.shop.R
import com.github.rmitsubayashi.data_shop.di.shopRepoModule
import kotlinx.android.synthetic.main.fragment_shop.view.*
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules


class ShopFragment: Fragment() {
    private val viewModel: ShopViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_shop, container, false)
        viewModel.getShop().observe(
            this, Observer { view.test.text = it.toString() }
        )
        return view
    }
}