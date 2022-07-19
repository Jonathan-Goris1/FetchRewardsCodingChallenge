package com.codingchallenge.fetchrewardscodingchallenge

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication

//To use the Hilt test application in instrumented tests, you need to configure a new test runner.
// This makes Hilt work for all of the instrumented tests in your project
class HiltTestRunner: AndroidJUnitRunner() {
    override fun newApplication(
        cl: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(cl, HiltTestApplication::class.java.name, context)
    }
}