package com.yigitbal.weatherapp.repository

import com.yigitbal.weatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService) {

    suspend fun getWeather() = apiService.getWeather()

}