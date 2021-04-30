package com.github.guuilp.feature.domain

import android.util.Log
import com.github.guuilp.core_di.ViewModelScope
import com.github.guuilp.feature.data.ExampleRepository
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface FirstUseCase {
    fun exampleFunction()
}

@ContributesBinding(ViewModelScope::class)
class FirstUseCaseImpl @Inject constructor(
    private val exampleRepository: ExampleRepository
) : FirstUseCase {

    init {
        Log.d("GLP", "Teste")
    }

    override fun exampleFunction() {
        Log.d("FUN_CALLED", "FirstUseCaseImpl.exampleFunction")

        exampleRepository.exampleFunction()
    }
}
