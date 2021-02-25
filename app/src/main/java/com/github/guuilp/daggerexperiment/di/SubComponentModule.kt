package com.github.guuilp.daggerexperiment.di

import com.github.guuilp.daggerexperiment.di.core.AppScope
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module

@Module(subcomponents = [ViewModelComponent::class])
@ContributesTo(AppScope::class)
interface SubComponentModule