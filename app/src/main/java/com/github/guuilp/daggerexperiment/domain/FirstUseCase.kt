package com.github.guuilp.daggerexperiment.domain

import android.util.Log
import com.github.guuilp.daggerexperiment.data.ExampleRepository
import com.github.guuilp.daggerexperiment.di.core.ViewModelScope
import com.github.guuilp.daggerexperiment.di.core.ViewModelScoped
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface FirstUseCase {
    fun exampleFunction()
}

@ContributesBinding(ViewModelScope::class)
class FirstUseCaseImpl @Inject constructor(
    private val exampleRepository: ExampleRepository
): FirstUseCase {
    override fun exampleFunction() {
        Log.d("FUN_CALLED", "ExampleUseCaseImpl.exampleFunction")

        exampleRepository.exampleFunction()
    }
}
