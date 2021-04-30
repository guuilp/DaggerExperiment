package com.github.guuilp.daggerexperiment.di

import com.github.guuilp.core_di.AppScope
import com.github.guuilp.core_di.ViewModelComponent
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module

@Module(subcomponents = [ViewModelComponent::class])
@ContributesTo(AppScope::class)
interface SubComponentModule