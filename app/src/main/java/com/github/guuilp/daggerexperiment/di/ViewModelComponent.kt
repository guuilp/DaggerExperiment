package com.github.guuilp.daggerexperiment.di

import com.github.guuilp.daggerexperiment.di.core.ViewModelMap
import com.github.guuilp.daggerexperiment.di.core.ViewModelScope
import com.github.guuilp.daggerexperiment.di.core.ViewModelScoped
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent

@MergeSubcomponent(ViewModelScope::class)
@ViewModelScoped
interface ViewModelComponent {

    fun getViewModelMap(): ViewModelMap

    @Subcomponent.Factory
    interface Factory {
        fun create(): ViewModelComponent
    }
}
