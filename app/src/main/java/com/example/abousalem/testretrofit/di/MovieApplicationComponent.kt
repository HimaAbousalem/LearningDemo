package com.example.abousalem.testretrofit.di

import com.example.abousalem.testretrofit.MovieApplication
import dagger.Component

@MovieApplicationScope
@Component(modules = [MovieServicesModule::class, ContextAppModule::class])
interface MovieApplicationComponent {
    fun injectMovieApplication(application: MovieApplication)
}