package com.github.guuilp.daggerexperiment.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.guuilp.daggerexperiment.domain.FirstUseCase
import com.github.guuilp.daggerexperiment.domain.SecondUseCase
import javax.inject.Inject

class SecondViewModel @Inject constructor(
    private val firstUseCase: FirstUseCase,
    private val secondUseCase: SecondUseCase
): ViewModel() {

    fun exampleFunction() {
        Log.d("FUN_CALLED", "ExampleViewModel.exampleFunction")

        firstUseCase.exampleFunction()
        secondUseCase.exampleFunction()
    }
}