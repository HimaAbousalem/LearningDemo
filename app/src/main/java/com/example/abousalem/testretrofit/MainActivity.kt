package com.example.abousalem.testretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit  = MovieApplication.get(this).movieServices
        retrofit!!.getMovies(BuildConfig.MOVIE_DB_API_TOKEN)
            .subscribeOn(Schedulers. io())
            .observeOn(AndroidSchedulers. mainThread())
            .subscribe { e-> Log.d("Data", e.results[1].original_title)}

    }
}
