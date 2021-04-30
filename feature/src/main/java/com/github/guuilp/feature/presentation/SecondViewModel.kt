package com.github.guuilp.feature.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.guuilp.core_di.AppScope
import com.github.guuilp.core_di.ViewModelKey
import com.github.guuilp.feature.domain.FirstUseCase
import com.github.guuilp.feature.domain.SecondUseCase
import com.squareup.anvil.annotations.ContributesMultibinding
import javax.inject.Inject

@ContributesMultibinding(AppScope::class)
@ViewModelKey(SecondViewModel::class)
class SecondViewModel @Inject constructor(
    private val firstUseCase: FirstUseCase,
    private val secondUseCase: SecondUseCase
) : ViewModel() {

    fun exampleFunction() {
        Log.d("FUN_CALLED", "SecondViewModel.exampleFunction")

        firstUseCase.exampleFunction()
        secondUseCase.exampleFunction()
    }
}