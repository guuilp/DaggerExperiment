package com.github.guuilp.core_di

import androidx.lifecycle.ViewModel
import com.github.guuilp.core_di.ViewModelScope
import com.github.guuilp.core_di.ViewModelScoped
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent
import javax.inject.Provider

typealias ViewModelMap = Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>

@ViewModelScoped
@MergeSubcomponent(ViewModelScope::class)
interface ViewModelComponent {

    fun getViewModelMap(): ViewModelMap

    @Subcomponent.Factory
    interface Factory {
        fun create(): ViewModelComponent
    }
}
