package com.example.weatherforecast.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

import com.example.weatherforecast.model.Wheather
import com.example.weatherforecast.utils.Constants


interface ApiService {

    @GET("weather/Moscow")
    suspend fun getWeather():Response<Wheather>

}