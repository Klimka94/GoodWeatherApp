package com.example.goodweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val textViewHello = findViewById<TextView>(R.id.textView)
        textViewHello.text = "Hello from code"

    val startButton = findViewById<Button>(R.id.buttonOne)
    startButton.setOnClickListener {
        Intent(this, WeatherActivity::class.java).also { startActivity(it) }
    }
    }
}