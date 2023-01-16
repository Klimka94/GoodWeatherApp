package com.example.goodweatherapp.features.wind_screen

class WindInteractor (private val windRepo: WindRepo) {
    fun getWindDeg(): String{
        return windRepo.getWindDeg()
    }
}