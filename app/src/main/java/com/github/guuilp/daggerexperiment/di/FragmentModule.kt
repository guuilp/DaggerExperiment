package com.github.guuilp.daggerexperiment.di

import androidx.fragment.app.Fragment
import com.github.guuilp.daggerexperiment.di.core.AppScope
import com.github.guuilp.daggerexperiment.di.core.FragmentKey
import com.github.guuilp.daggerexperiment.view.ExampleFragment
import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
@ContributesTo(AppScope::class)
interface FragmentModule {

    @[Binds IntoMap FragmentKey(ExampleFragment::class)]
    fun bindsExampleFragment(fragment: ExampleFragment): Fragment
}
