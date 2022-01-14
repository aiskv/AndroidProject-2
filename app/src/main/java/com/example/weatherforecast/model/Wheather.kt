package com.example.weatherforecast.model

data class Wheather(
    val description: String,
    val forecast: List<Forecast>,
    val temperature: String,
    val wind: String
)
