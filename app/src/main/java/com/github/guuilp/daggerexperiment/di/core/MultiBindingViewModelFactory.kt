package com.github.guuilp.daggerexperiment.di.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.di.ViewModelComponent
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Provider

typealias ViewModelMap = Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>

class MultiBindingViewModelFactory @Inject constructor(
    private val map: ViewModelMap
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return map[modelClass]?.get() as? T?
            ?: throw IllegalStateException("Could not create ViewModel of type $modelClass")
    }
}
