package com.github.guuilp.daggerexperiment

import android.app.Application
import com.github.guuilp.daggerexperiment.di.DaggerApplicationComponent

class ExampleApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()
}