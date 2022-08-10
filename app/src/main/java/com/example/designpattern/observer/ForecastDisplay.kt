package com.example.designpattern.observer

import kotlin.math.max

class ForecastDisplay(weatherStation: Subject) : Observer {
    private val tempHistory: MutableList<Int>
    private val humidityHistory: MutableList<Int>

    override fun update(temp: Int, humidity: Int) {
        tempHistory.add(temp)
        humidityHistory.add(temp)
        display7DayHistory()
    }

    private fun display7DayHistory() {
        //Print Last 7 days History of Temperature and Humidity
        println(
            "Temperature History: " +
                    tempHistory.subList(max(tempHistory.size - 7, 0), tempHistory.size)
        )
        println(
            "Humidity History: " +
                    humidityHistory.subList(
                        max(humidityHistory.size - 7, 0),
                        humidityHistory.size
                    )
        )
    }

    init {
        tempHistory = ArrayList()
        humidityHistory = ArrayList()
        weatherStation.registerObserver(this)
    }
}