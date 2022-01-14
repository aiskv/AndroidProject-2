package com.example.weatherforecast.repository

import com.example.weatherforecast.api.ApiService
import javax.inject.Inject

class WheatherRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getWeather() = apiService.getWeather()
}