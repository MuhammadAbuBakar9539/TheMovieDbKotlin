package com.example.themoviedb.network

import MovieDbModel
import MovieModelDetail
import com.example.themoviedb.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitImplementation (private var onFinishedListener: OnFinishedListener){
    fun getMovies() {
        //val call: Call<MovieDbModel> = Instances.getClient().getPopularMovies(Constants.API_KEY)

        /*call.enqueue(object : Callback<MovieDbModel> {
            override fun onFailure(call: Call<MovieDbModel>, t: Throwable) {
                onFinishedListener.failure(t.message.toString())
            }

            override fun onResponse(
                call: Call<MovieDbModel>, response: Response<MovieDbModel>
            ) {
                if (response.isSuccessful) {
                    onFinishedListener.success(response.body())
                } else {
                    onFinishedListener.failure(response.message().toString())
                }
            }

        })*/
    }

//    fun getMoviesDetail(id:String){
//        val call: Call<MovieModelDetail> =
//            Instances.getClient().getMovieDetails(id, Constants.API_KEY)
//
//        call.enqueue(object : Callback<MovieModelDetail> {
//            override fun onFailure(call: Call<MovieModelDetail>, t: Throwable) {
//                onFinishedListener.failure(t.message.toString())
//            }
//
//            override fun onResponse(
//                call: Call<MovieModelDetail>,
//                response: Response<MovieModelDetail>
//            ) {
//                if (response.isSuccessful) {
//                    onFinishedListener.success(response.body())
//                }
//                else{
//                    onFinishedListener.failure(response.message())
//                }
//            }
//
//        })
//    }
}