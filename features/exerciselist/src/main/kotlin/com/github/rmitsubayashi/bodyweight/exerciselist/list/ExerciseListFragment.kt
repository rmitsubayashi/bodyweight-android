package com.github.rmitsubayashi.bodyweight.exerciselist.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.rmitsubayashi.bodyweight.exerciselist.R

class ExerciseListFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_exercise_list, container, false)
    }
}