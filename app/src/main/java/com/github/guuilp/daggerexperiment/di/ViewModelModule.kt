package com.github.guuilp.daggerexperiment.di

import androidx.lifecycle.ViewModel
import com.github.guuilp.daggerexperiment.di.core.ViewModelKey
import com.github.guuilp.daggerexperiment.di.core.ViewModelScope
import com.github.guuilp.daggerexperiment.presentation.FirstViewModel
import com.github.guuilp.daggerexperiment.presentation.SecondViewModel
import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
@ContributesTo(ViewModelScope::class)
interface ViewModelModule {

    @[Binds IntoMap ViewModelKey(FirstViewModel::class)]
    fun bindsFirstViewModel(viewModel: FirstViewModel): ViewModel

    @[Binds IntoMap ViewModelKey(SecondViewModel::class)]
    fun bindsSecondViewModel(viewModel: SecondViewModel): ViewModel
}
