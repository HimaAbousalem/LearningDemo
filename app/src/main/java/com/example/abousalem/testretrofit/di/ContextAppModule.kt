package com.example.abousalem.testretrofit.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextAppModule{

    private var context: Context?= null
    constructor(context: Context){
        this.context = context
    }

    @Provides
    fun getApplication(): Context? {
        return context
    }
}