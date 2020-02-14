package com.example.themoviedb.recycle_view

import MovieDbModel
import Results
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.themoviedb.Constants
import com.example.themoviedb.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_layout.view.*
import com.example.themoviedb.recycle_view.OnRecycleItemClicked as OnRecycleItemClicked1

class MovieAdapter(
    private val movieDbModel: MovieDbModel, private val onRecycleItemClicked: OnRecycleItemClicked1
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return movieDbModel.results.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = movieDbModel.results[position].title
        holder.voteAverage.rating = (movieDbModel.results[position].vote_average / 2).toFloat()
        Picasso.get().load(Constants.IMG_BASE_URL + movieDbModel.results[position].poster_path)
            .into(holder.poster)

        holder.bind(movieDbModel.results[position])
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val poster: ImageView = view.img_poster
        val title: TextView = view.tv_title
        val voteAverage: RatingBar = view.rb_vote_average

        fun bind(movieDbModel: Results) {
            itemView.setOnClickListener {
                onRecycleItemClicked.onRecycleItemClicked(movieDbModel)
            }
        }
    }
}