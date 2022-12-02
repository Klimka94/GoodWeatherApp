package com.example.goodweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonWeather = findViewById<Button>(R.id.buttonWeather)
        buttonWeather.setOnClickListener {
            val intent = Intent(this, `WeatherActivity`::class.java).also(::startActivity)
        }
    }
}