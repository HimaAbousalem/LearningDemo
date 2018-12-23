package com.example.abousalem.testretrofit

import android.app.Activity
import android.app.Application
import com.example.abousalem.testretrofit.di.DaggerMovieApplicationComponent
import javax.inject.Inject

class MovieApplication: Application() {
    companion object {
        fun get(activity:Activity):MovieApplication{
            return activity.applicationContext as MovieApplication
        }
    }
    @Inject
    lateinit var movieServices: MovieApi

    override fun onCreate() {
        super.onCreate()
        val component = DaggerMovieApplicationComponent.builder().build()
        component.injectMovieApplication(this)


    }
}
