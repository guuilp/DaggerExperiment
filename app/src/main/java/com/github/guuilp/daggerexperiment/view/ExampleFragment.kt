package com.github.guuilp.daggerexperiment.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.presentation.ExampleViewModel
import javax.inject.Inject

class ExampleFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
): Fragment() {

    private val viewModel by viewModels<ExampleViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("FUN_CALLED", "ExampleFragment.onCreate")

        viewModel.exampleFunction()
    }
}