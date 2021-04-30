package com.github.guuilp.feature.di

import androidx.fragment.app.Fragment
import com.github.guuilp.core_di.AppScope
import com.github.guuilp.core_di.FragmentKey
import com.github.guuilp.feature.view.FirstFragment
import com.github.guuilp.feature.view.SecondFragment
import com.squareup.anvil.annotations.ContributesTo
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
@ContributesTo(AppScope::class)
interface FragmentModule {

    @[Binds IntoMap FragmentKey(FirstFragment::class)]
    fun bindsFirstFragment(fragment: FirstFragment): Fragment

    @[Binds IntoMap FragmentKey(SecondFragment::class)]
    fun bindsSecondFragment(fragment: SecondFragment): Fragment
}
