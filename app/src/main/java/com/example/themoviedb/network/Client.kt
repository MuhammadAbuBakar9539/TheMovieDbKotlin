package com.example.themoviedb.network

import MovieDbModel
import MovieModelDetail
import com.example.themoviedb.Constants
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Client {
    @GET("movie/popular")
    fun getPopularMovies(@Query(Constants.API_KEY_NAME) api_key: String): Observable<MovieDbModel>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id")id:String, @Query(Constants.API_KEY_NAME)api_key: String):Call<MovieModelDetail>
}