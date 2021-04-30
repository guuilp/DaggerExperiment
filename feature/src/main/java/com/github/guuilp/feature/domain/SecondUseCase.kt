package com.github.guuilp.feature.domain

import android.util.Log
import com.github.guuilp.core_di.ViewModelScope
import com.github.guuilp.feature.data.ExampleRepository
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface SecondUseCase {
    fun exampleFunction()
}

@ContributesBinding(ViewModelScope::class)
class SecondUseCaseImpl @Inject constructor(
    private val exampleRepository: ExampleRepository
) : SecondUseCase {

    init {
        Log.d("GLP", "Teste")
    }

    override fun exampleFunction() {
        Log.d("FUN_CALLED", "SecondUseCaseImpl.exampleFunction")

        exampleRepository.exampleFunction()
    }
}
