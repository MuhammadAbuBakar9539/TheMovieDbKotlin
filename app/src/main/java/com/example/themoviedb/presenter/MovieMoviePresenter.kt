package com.example.themoviedb.presenter

import com.example.themoviedb.Constants
import com.example.themoviedb.MovieContract
import com.example.themoviedb.network.Instances
import com.example.themoviedb.network.OnFinishedListener
import com.example.themoviedb.network.RetrofitImplementation

class MovieMoviePresenter(private var view:MovieContract.MovieView?) :
    MovieContract.MoviePresenter,OnFinishedListener{
    //val retrofitImplementation = RetrofitImplementation(this)

    private val call = Instances.getClient().getPopularMovies(Constants.API_KEY)

    override fun getMovies() {

    }

    override fun onDestroyCalled() {
        view=null
    }

    override fun <T> success(dataList: T) {
        view?.showMovies(dataList)
    }

    override fun failure(errorMessage: String) {
        view?.showError(errorMessage)
    }

}