package com.example.goodweatherapp.features.wind_screen

class WindRepoImpl (private val windRemoteSource: WindRemoteSource): WindRepo {
    override fun getWindDeg(): String {
        return windRemoteSource.getWindDeg().toString()
    }
}