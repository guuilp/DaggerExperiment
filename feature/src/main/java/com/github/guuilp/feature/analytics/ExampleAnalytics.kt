package com.github.guuilp.feature.analytics

import android.util.Log
import javax.inject.Inject

interface ExampleAnalytics {
    fun exampleFunction()
}

class ExampleAnalyticsImpl @Inject constructor() : ExampleAnalytics {
    override fun exampleFunction() {
        Log.d("FUN_CALLED", "ExampleAnalyticsImpl.exampleFunction")
    }
}
