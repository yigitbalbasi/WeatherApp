package com.yigitbal.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.yigitbal.weatherapp.databinding.ActivityMainBinding
import com.yigitbal.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.weatherResp.observe(this) { weather ->

            binding.apply {
                textViewCity.text = "Ankara"
                textViewTemperature.text = weather.temperature
                textViewDescription.text = weather.description
                textViewWind.text = weather.wind

                val forecast1 = weather.forecast[0]
                val forecast2 = weather.forecast[1]
                val forecast3 = weather.forecast[2]

                textviewForecast1.text = "${forecast1.temperature} / ${forecast1.wind}"
                textviewForecast2.text = "${forecast2.temperature} / ${forecast2.wind}"
                textviewForecast3.text = "${forecast3.temperature} / ${forecast3.wind}"

            }

        }


    }


}