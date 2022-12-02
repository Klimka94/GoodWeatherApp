package com.example.goodweatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.UUID

class `WeatherActivity`: AppCompatActivity() {

    private val weatherPresenter = WeatherPresenter()

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val textWeather = findViewById<TextView>(R.id.textWeather)
        textWeather.text = weatherPresenter.getWeather(UUID.randomUUID().toString())
    }
}