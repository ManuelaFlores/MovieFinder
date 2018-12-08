package com.manuflowers.moviefinder.repository.remote.api

import com.manuflowers.moviefinder.BuildConfig
import com.manuflowers.moviefinder.ui.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface OMDbApi {
    @GET(BuildConfig.URL_SEARCH_MOVIE)
    fun movieList(
        @Query("api_key") api_key: String,
        @Query("query") query: String
    ): Call<Movie>
}

//'https://api.themoviedb.org/3/search/movie?api_key=fa155f635119344d33fcb84fb807649b&query=coco
//https://api.themoviedb.org/3/movie/354912?api_key=fa155f635119344d33fcb84fb807649b
//https://www.omdbapi.com/?&apikey=a00f7a66&s=coco&type=movie

