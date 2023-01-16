package com.example.goodweatherapp.featiures.weather_screen.data

import com.example.goodweatherapp.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("weather")
    fun getWeather(
        @Query("q") query: String,
        @Query("appid") apikey: String = API_KEY
        )
}