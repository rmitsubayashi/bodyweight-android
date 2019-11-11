package com.github.rmitsubayashi.data_shop.local

import com.github.rmitsubayashi.shop_data.entity.Exercise
import com.github.rmitsubayashi.shop_data.entity.ExerciseProduct

fun convertFromLocalExerciseProduct(localProduct: LocalExerciseProduct, localProductExercises: List<LocalExerciseProductExercise>): ExerciseProduct {
    val categoryID = localProduct.categoryID
    val exercises = localProductExercises.map { convertFromLocalExercise(categoryID, it) }
    return ExerciseProduct(
        localProduct.title,
        categoryID,
        exercises,
        localProduct.price,
        localProduct.sold
    )
}

private fun convertFromLocalExercise(categoryID: Int, localModel: LocalExerciseProductExercise): Exercise {
    return Exercise(
        localModel.exerciseID,
        localModel.title,
        categoryID,
        localModel.level,
        localModel.quantity
    )
}

fun convertToLocalExerciseProduct(model: ExerciseProduct): LocalExerciseProduct {
    return LocalExerciseProduct(
        model.categoryID,
        model.title,
        model.price,
        model.sold
    )
}

fun convertToLocalExerciseProductExercises(model: ExerciseProduct): List<LocalExerciseProductExercise> {
    val productID = model.categoryID
    return model.exercises.map { convertToLocalExercise(it, productID) }
}

private fun convertToLocalExercise(model: Exercise, productID: Int): LocalExerciseProductExercise {
    return LocalExerciseProductExercise(
        model.id,
        model.title,
        model.level,
        model.quantity,
        productID
    )
}