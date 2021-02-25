package com.github.guuilp.daggerexperiment.di

import androidx.lifecycle.ViewModel
import com.github.guuilp.daggerexperiment.di.core.ViewModelKey
import com.github.guuilp.daggerexperiment.di.core.ViewModelScope
import com.github.guuilp.daggerexperiment.presentation.ExampleViewModel
import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
@ContributesTo(ViewModelScope::class)
interface ViewModelModule {

    @[Binds IntoMap ViewModelKey(ExampleViewModel::class)]
    fun bindsExampleFragment(viewModel: ExampleViewModel): ViewModel
}
