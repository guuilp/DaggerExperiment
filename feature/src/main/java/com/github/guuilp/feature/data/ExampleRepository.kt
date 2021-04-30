package com.github.guuilp.feature.data

import android.util.Log
import com.github.guuilp.core_di.ViewModelScope
import com.github.guuilp.core_di.ViewModelScoped
import com.squareup.anvil.annotations.ContributesBinding
import java.util.*
import javax.inject.Inject

interface ExampleRepository {
    fun exampleFunction()
}

@ViewModelScoped
@ContributesBinding(ViewModelScope::class)
class ExampleRepositoryImpl @Inject constructor() : ExampleRepository {

    private val uuid = UUID.randomUUID()

    override fun exampleFunction() {
        Log.d("FUN_CALLED", "ExampleRepositoryImpl.exampleFunction $uuid")
    }
}
