package com.example.goodweatherapp.features.wind_screen

import com.example.goodweatherapp.BASE_URL
import com.example.goodweatherapp.featiures.weather_screen.data.WeatherApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit


object WindApiClinet {
    private val okHttpClient = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()

    private val windApi = retrofit.create(WindApi::class.java)

        fun getApi(): WindApi {
            return windApi
        }
}