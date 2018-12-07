package com.manuflowers.moviefinder.ui.detail

import android.util.Log
import com.manuflowers.moviefinder.repository.remote.api.OMDbApiManager
import com.manuflowers.moviefinder.ui.model.DetailOfMovie
import com.manuflowers.moviefinder.ui.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailInteractor {
    fun makeRequest(movie_id: String?, callBack: DetailContract.CallBack){
        val call: Call<DetailOfMovie> = OMDbApiManager
            .getRetrofit()
            .detailOfMovie(movie_id!!,"fa155f635119344d33fcb84fb807649b")

    call.enqueue( object : Callback<DetailOfMovie> {
        override fun onFailure(call: Call<DetailOfMovie>, t: Throwable) {
            Log.e(" M- ON FAILURE DETAIL", "FAILURE ${t.message}")
            callBack.onFailureService(t.message)
        }

        override fun onResponse(call: Call<DetailOfMovie>, response: Response<DetailOfMovie>) {
            if(response.isSuccessful){
                val detailOfMovie: DetailOfMovie = response.body()!!
                Log.e(" M- manuela", " detail ON succes ${detailOfMovie}")
                callBack.onSuccessFul(detailOfMovie)

            } else {
                Log.e(" M- manuela", "ON ERROR detail ${response.message()}")
                callBack.onErrorService(response.message())
            }
        }

    })
    }
}