package com.github.guuilp.daggerexperiment.di

import com.github.guuilp.daggerexperiment.di.core.MultiBindingViewModelFactory
import com.github.guuilp.daggerexperiment.di.core.ViewModelScope
import com.github.guuilp.daggerexperiment.di.core.ViewModelScoped
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent

@MergeSubcomponent(ViewModelScope::class)
@ViewModelScoped
interface ViewModelComponent {

    fun getViewModelFactory(): MultiBindingViewModelFactory

    @Subcomponent.Builder
    interface Builder {
        fun build(): ViewModelComponent
    }
}
