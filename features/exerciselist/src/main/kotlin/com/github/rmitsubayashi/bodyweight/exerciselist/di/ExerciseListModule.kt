package com.github.rmitsubayashi.bodyweight.exerciselist.di

import com.github.rmitsubayashi.bodyweight.exerciselist.list.ExerciseListViewModel
import com.github.rmitsubayashi.data_shop.di.shopRepoModule
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val exerciseListModule = module {
    viewModel { ExerciseListViewModel(get()) }
}

val exerciseListModules = listOf(exerciseListModule, shopRepoModule)