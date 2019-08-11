package com.github.rmitsubayashi.bodyweight.exerciselist.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.github.rmitsubayashi.bodyweight.exerciselist.R
import kotlinx.android.synthetic.main.fragment_exercise_list.view.*
import org.koin.android.viewmodel.ext.android.viewModel

class ExerciseListFragment: Fragment() {
    private val viewModel: ExerciseListViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_exercise_list, container, false)
        viewModel.test().observe(this,
            Observer { view.test2.text = (it+10).toString() }
        )
        return view
    }
}