package com.github.guuilp.daggerexperiment.di.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.core_di.AppScope
import com.github.guuilp.core_di.ViewModelComponent
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

@ContributesBinding(AppScope::class)
class MultiBindingViewModelFactory @Inject constructor(
    private val viewModelComponent: ViewModelComponent.Factory,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModelMap = viewModelComponent.create().getViewModelMap()
        return viewModelMap[modelClass]?.get() as? T?
            ?: throw IllegalStateException("Could not create ViewModel of type $modelClass")
    }
}
