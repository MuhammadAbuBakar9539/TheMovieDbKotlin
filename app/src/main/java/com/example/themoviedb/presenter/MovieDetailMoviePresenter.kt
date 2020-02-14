/*
package com.example.themoviedb.presenter

import com.example.themoviedb.MovieContract
import com.example.themoviedb.network.OnFinishedListener
import com.example.themoviedb.network.RetrofitImplementation

class MovieDetailMoviePresenter(private var view: MovieContract.MovieDetailView?) :
    MovieContract.MovieDetailPresenter, OnFinishedListener {
    override fun getMovies(id: String) {
        val retrofitImplementation = RetrofitImplementation(this)
        retrofitImplementation.getMoviesDetail(id)
    }

    override fun onDestroyCalled() {
        view = null
    }

    override fun <T> success(dataList: T) {
        view?.showMovies(dataList)
    }

    override fun failure(errorMessage: String) {
        view?.showError(errorMessage)
    }
}*/
