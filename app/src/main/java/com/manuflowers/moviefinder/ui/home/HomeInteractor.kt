package com.manuflowers.moviefinder.ui.home

import android.util.Log
import com.manuflowers.moviefinder.repository.remote.api.OMDbApiManager
import com.manuflowers.moviefinder.ui.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeInteractor {
    fun makeRequest(query: String?, callback: HomeContract.Callback) {
        val call: Call<Movie> = OMDbApiManager
            .getRetrofit()
            .movieList("fa155f635119344d33fcb84fb807649b", query!!)

        call.enqueue(object : Callback<Movie> {
            override fun onFailure(call: Call<Movie>, t: Throwable) {
                Log.e(" M- ON FAILURE", "FAILURE ${t.message}")
                callback.onFailureService(t.message)
            }

            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                if (response.isSuccessful) {
                    val moviesList: Movie = response.body()!!
                    Log.e(" M- manuela", "ON succes")
                    callback.onSuccessful(moviesList.results)
                } else {
                    Log.e(" M- manuela", "ON ERROR ${response.message()}")
                    callback.onErrorService(response.message())
                }
            }
        })
    }

}