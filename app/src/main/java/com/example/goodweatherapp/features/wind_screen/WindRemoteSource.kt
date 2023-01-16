package com.example.goodweatherapp.features.wind_screen

class WindRemoteSource(private val api: WindApi) {

    fun getWindDeg() {
        return api.getWindDeg(query = "Baranovichy")
    }
}