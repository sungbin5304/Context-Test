package me.sungbin.contexttest

import android.app.Application
import android.content.Context

class ContextTest : Application(){

    companion object {
        lateinit var appContext: Context
        lateinit var actContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        actContext = this
    }

}