package com.example.abousalem.testretrofit

import android.app.Activity
import android.app.Application

class MovieApplication: Application() {

    companion object {
        fun get(activity:Activity):MovieApplication{
            return activity.applicationContext as MovieApplication
        }
    }
    var movieServices: MovieApi? = null
    override fun onCreate() {
        super.onCreate()
        //val component = DaggerMovieApplication.Builder()

//        val interceptor = HttpLoggingInterceptor()
//            .setLevel(HttpLoggingInterceptor.Level.BODY)
//
//        val okHttpClient = OkHttpClient.Builder()
//            .addInterceptor(interceptor)
//            .build()
//
//        retrofit = Retrofit.Builder()
//            .baseUrl("https://api.themoviedb.org/3/")
//            .client(okHttpClient)
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        movieServices = retrofit!!.create(MovieApi::class.java)

    }
}
