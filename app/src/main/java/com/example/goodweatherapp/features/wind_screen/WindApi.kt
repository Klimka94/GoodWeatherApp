package com.example.goodweatherapp.features.wind_screen

import com.example.goodweatherapp.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface WindApi {

    @GET("wind.deg")
    fun getWindDeg(
        @Query("q") query: String,
        @Query("appid") apikey: String = API_KEY
    )
}