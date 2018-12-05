package com.manuflowers.moviefinder.repository.remote.api

import android.telecom.Call
import com.manuflowers.moviefinder.BuildConfig
import com.manuflowers.moviefinder.ui.model.Movie
import retrofit2.http.GET
import retrofit2.http.Query

interface OMDbApi {
    @GET(BuildConfig.URL_SEARCH_MOVIE)
    fun movieList(@Query("api_key") api_key: String,
                  @Query("query") query: String) : retrofit2.Call<Movie>
}

/*
* interface OMDbApi {
    @GET(BuildConfig.URL_SEARCH_MOVIE)
    fun movieList(@Query("api_key") api_key: String,
                  @Query("query") query: String): Call<Movie>
}
* */
