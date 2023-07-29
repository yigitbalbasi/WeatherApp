package com.yigitbal.weatherapp.api

import com.yigitbal.weatherapp.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Ankara")
    suspend fun getWeather(): Response<Weather>
}