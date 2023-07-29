package com.yigitbal.weatherapp

data class Weather(

    var temperature: String? = null,
    var wind: String? = null,
    var description: String? = null,
    var forecast: ArrayList<Forecast> = arrayListOf()

)