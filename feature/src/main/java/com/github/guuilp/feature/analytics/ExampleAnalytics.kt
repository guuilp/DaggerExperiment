package com.github.guuilp.feature.analytics

import android.util.Log
import com.github.guuilp.core_di.AppScope
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface ExampleAnalytics {
    fun exampleFunction()
}

@ContributesBinding(AppScope::class)
class ExampleAnalyticsImpl @Inject constructor() : ExampleAnalytics {
    override fun exampleFunction() {
        Log.d("FUN_CALLED", "ExampleAnalyticsImpl.exampleFunction")
    }
}
