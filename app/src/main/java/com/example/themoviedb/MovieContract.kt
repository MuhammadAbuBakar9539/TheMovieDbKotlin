package com.example.themoviedb

interface MovieContract {
    interface MovieView {
        fun showMovies(movieDbModel: Any?)
        fun showError(errorMessage: String?)
        fun showProgressBar()
        fun hideProgressBar()
    }

    interface MovieDetailView {
        fun showMovies(movieDbModel: Any?)
        fun showError(errorMessage: String?)
        fun showProgressBar()
        fun hideProgressBar()
    }

    interface MoviePresenter {
        fun getMovies()
        fun onDestroyCalled()
    }

    interface MovieDetailPresenter {
        fun getMovies(id:String)
        fun onDestroyCalled()
    }
}