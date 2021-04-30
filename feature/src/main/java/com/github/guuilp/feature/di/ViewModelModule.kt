package com.github.guuilp.feature.di

import androidx.lifecycle.ViewModel
import com.github.guuilp.core_di.ViewModelKey
import com.github.guuilp.core_di.ViewModelScope
import com.github.guuilp.feature.presentation.FirstViewModel
import com.github.guuilp.feature.presentation.SecondViewModel
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
