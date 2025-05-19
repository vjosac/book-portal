package com.example.bookportal

import android.app.Application
import com.example.bookportal.data.AppContainer
import com.example.bookportal.data.DefaultAppContainer

class Application : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}