package com.github.guuilp.feature.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.guuilp.feature.domain.FirstUseCase
import com.github.guuilp.feature.domain.SecondUseCase
import javax.inject.Inject

class FirstViewModel @Inject constructor(
    private val firstUseCase: FirstUseCase,
    private val secondUseCase: SecondUseCase
) : ViewModel() {

    fun exampleFunction() {
        Log.d("FUN_CALLED", "FirstViewModel.exampleFunction")

        firstUseCase.exampleFunction()
        secondUseCase.exampleFunction()
    }
}