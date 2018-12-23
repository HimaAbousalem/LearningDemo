package com.example.abousalem.testretrofit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit  = MovieApplication.get(this).movieServices
        val data = retrofit.getMovies(BuildConfig.MOVIE_DB_API_TOKEN)
            .subscribeOn(Schedulers.io())
            . toObservable()
            .map{e -> e.results}
            .flatMap { e-> Observable.fromIterable(e) }
          //  .map { r-> r.title }
            .observeOn(AndroidSchedulers.mainThread())
                //here we transform MoviesRequest to List of Movies

            .subscribe{ e-> e.original_title}


    }
}
