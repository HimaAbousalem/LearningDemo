package com.example.abousalem.testretrofit

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    fun getMovies(@Query("api_key")api_key: String): Single<MoviesRequest>
}