package com.github.rmitsubayashi.bodyweight.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mitsubayashi.bodyweight.shop.R
import kotlinx.android.synthetic.main.fragment_shop.view.*
import org.koin.android.viewmodel.ext.android.viewModel


class ShopFragment: Fragment() {
    private val viewModel: ShopViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_shop, container, false)
        view.test.text = viewModel.getShop().toString()
        return view
    }
}