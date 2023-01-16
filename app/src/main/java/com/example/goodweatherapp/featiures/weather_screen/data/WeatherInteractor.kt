package com.example.goodweatherapp.featiures.weather_screen.data

class WeatherInteractor(private val weatherRepo: WeatherRepo) {
    fun getWeather(): String {
        return weatherRepo.getTemperature()
    }
}