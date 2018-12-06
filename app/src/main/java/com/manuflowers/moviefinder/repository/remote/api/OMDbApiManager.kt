package com.manuflowers.moviefinder.repository.remote.api

import com.manuflowers.moviefinder.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OMDbApiManager {

    fun getRetrofit(): OMDbApi {
        val okHttpClient = OkHttpClient.Builder().build()
        val client = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return client.create<OMDbApi>(OMDbApi::class.java)
    }
}