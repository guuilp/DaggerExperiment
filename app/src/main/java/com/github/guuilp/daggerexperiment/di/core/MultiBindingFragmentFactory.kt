package com.github.guuilp.daggerexperiment.di.core

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Provider

typealias FragmentMap = Map<Class<out Fragment>, @JvmSuppressWildcards Provider<Fragment>>

@ContributesBinding(AppScope::class, FragmentFactory::class)
class MultiBindingFragmentFactory @Inject constructor(
    private val map : FragmentMap
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragmentClass = loadFragmentClass(classLoader, className)
        return map[fragmentClass]?.get() ?: super.instantiate(classLoader, className)
    }
}
