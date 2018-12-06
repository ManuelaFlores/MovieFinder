package com.manuflowers.moviefinder.ui.detail

import android.util.Log
import com.manuflowers.moviefinder.repository.remote.api.OMDbApiManager
import com.manuflowers.moviefinder.ui.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailInteractor {
    fun makeRequest(query: String, callBack: DetailContract.CallBack){
        val call: Call<Result> = OMDbApiManager
            .getRetrofit()
            .result("354912","fa155f635119344d33fcb84fb807649b")

    call.enqueue( object : Callback<Result> {
        override fun onFailure(call: Call<Result>, t: Throwable) {
            Log.e(" M- ON FAILURE DETAIL", "FAILURE ${t.message}")
            callBack.onFailureService(t.message)
        }

        override fun onResponse(call: Call<Result>, response: Response<Result>) {
            if(response.isSuccessful){
                Log.e(" M- manuela", " detail ON succes")
                callBack.onSuccessFul(response.body()!!)

            } else {
                Log.e(" M- manuela", "ON ERROR detail ${response.message()}")
                callBack.onErrorService(response.message())
            }
        }

    })
    }
}