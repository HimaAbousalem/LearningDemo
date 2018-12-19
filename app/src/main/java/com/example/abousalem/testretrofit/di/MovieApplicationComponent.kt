package com.example.abousalem.testretrofit.di

import com.example.abousalem.testretrofit.MovieApi
import com.example.abousalem.testretrofit.MovieApplication
import dagger.Component

@MovieApplicationScope
@Component(modules = [MovieServicesModule::class, ContextModule::class])
interface MovieApplicationComponent {
    //fun injectMovieApplication(application: MovieApplication)
    fun getMovieApi(): MovieApi
}