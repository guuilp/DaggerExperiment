package com.github.guuilp.core_di

import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass

@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(value = AnnotationRetention.RUNTIME)
@MapKey
annotation class FragmentKey(val value: KClass<out Fragment>)
