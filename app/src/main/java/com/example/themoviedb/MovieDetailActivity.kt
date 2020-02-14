package com.example.themoviedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*

/*
class MovieDetailActivity : AppCompatActivity(), MovieContract.MovieDetailView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        showMoviesDetail()
    }

    private fun showMoviesDetail() {
        val id: String = intent.getIntExtra(Constants.INTENTS_KEY, 0).toString()

    }

    */
/*override fun showMovies(movieDbModel: Any?) {
        rb_vote_average_detail.visibility = View.VISIBLE
        tv_Overview.visibility = View.VISIBLE
        lil_progressBar_detail.visibility = View.GONE
        tv_title_detail.text = movieDbModel?.
        tv_overview_detail.setText(movieDbModel?.overview)
        Picasso.get().load(Constants.IMG_BASE_URL + movieDbModel?.poster_path)
            .into(img_poster_detail)
        val rating = movieDbModel?.vote_average?.div(2)
        rb_vote_average_detail.rating = rating?.toFloat()!!
    }*//*


    override fun showError(errorMessage: String?) {
        rb_vote_average_detail.visibility= View.GONE
        tv_Overview.visibility = View.GONE
        hideProgressBar()
        lil_error_detail.visibility = View.VISIBLE
        tv_error_detail.text = errorMessage
        btn_retry_detail.setOnClickListener {
            lil_error_detail.visibility = View.GONE
            showProgressBar()
            showMoviesDetail()
        }
    }

    override fun showProgressBar() {
        lil_progressBar_detail.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        lil_progressBar_detail.visibility = View.GONE
    }
}
*/
