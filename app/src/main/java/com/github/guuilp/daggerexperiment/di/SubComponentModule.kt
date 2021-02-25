package com.github.guuilp.daggerexperiment.di

import androidx.lifecycle.ViewModelProvider
import com.github.guuilp.daggerexperiment.di.core.AppScope
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@Module(subcomponents = [ViewModelComponent::class])
@ContributesTo(AppScope::class)
class SubComponentModule {

    @Provides
    fun provideViewModelFactory(
        viewModelComponent: ViewModelComponent.Builder
    ) : ViewModelProvider.Factory {
        return viewModelComponent.build().getViewModelFactory()
    }
}