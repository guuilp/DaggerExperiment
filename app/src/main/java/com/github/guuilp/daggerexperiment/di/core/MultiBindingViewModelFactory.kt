package com.github.guuilp.daggerexperiment.di.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.di.ViewModelComponent
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Provider

typealias ViewModelMap = Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>

@ContributesBinding(AppScope::class)
class MultiBindingViewModelFactory @Inject constructor(
    private val viewModelComponent: Provider<ViewModelComponent.Factory>,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModelMap = viewModelComponent.get().create().getViewModelMap()
        return viewModelMap[modelClass]?.get() as? T?
            ?: throw IllegalStateException("Could not create ViewModel of type $modelClass")
    }
}
