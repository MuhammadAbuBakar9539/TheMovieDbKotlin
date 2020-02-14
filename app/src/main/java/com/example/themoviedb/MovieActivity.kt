package com.example.themoviedb

import MovieDbModel
import Results
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.themoviedb.presenter.MovieMoviePresenter
import com.example.themoviedb.recycle_view.MovieAdapter
import com.example.themoviedb.recycle_view.OnRecycleItemClicked
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity(), MovieContract.MovieView{
    private lateinit var moviePresenter: MovieContract.MoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        moviePresenter = MovieMoviePresenter(this)
        moviePresenter.getMovies()
    }

    override fun showMovies(movieDbModel: Any?) {
        rv_movie_db.layoutManager = (LinearLayoutManager(applicationContext))
        val movieAdapter = movieDbModel?.let {
            MovieAdapter(it as MovieDbModel,object :OnRecycleItemClicked{
                override fun onRecycleItemClicked(movieDbModel: Results) {
                    /*val intent = Intent(this@MovieActivity, MovieDetailActivity::class.java)
                    intent.putExtra(Constants.INTENTS_KEY, movieDbModel.id)
                    startActivity(intent)*/
                }
            })
        }
        hideProgressBar()
        rv_movie_db.adapter = movieAdapter
    }

    override fun showError(errorMessage: String?) {
        hideProgressBar()
        lil_error.visibility = View.VISIBLE
        tv_error.text = errorMessage
        btn_retry.setOnClickListener {
            lil_error.visibility = View.GONE
            showProgressBar()
            moviePresenter.getMovies()
        }
    }

    override fun showProgressBar() {
        lil_progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        lil_progressBar.visibility = View.GONE
    }


}
