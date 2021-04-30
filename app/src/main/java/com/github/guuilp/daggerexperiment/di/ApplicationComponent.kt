package com.github.guuilp.daggerexperiment.di

import com.github.guuilp.daggerexperiment.MainActivity
import com.github.guuilp.core_di.AppScope
import com.squareup.anvil.annotations.MergeComponent

@MergeComponent(AppScope::class)
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}
