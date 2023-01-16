package com.example.goodweatherapp.featiures.weather_screen.data

import okhttp3.Response

class WeatherRemoteSource(private val api: WeatherApi) {

    //TODO add query
    fun getWeather() {
        return api.getWeather(query = "Baranovichy")
    }
}