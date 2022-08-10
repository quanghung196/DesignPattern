package com.example.designpattern.observer

import java.util.*

fun main() {
    //Create the data object (publisher / topic)
    val weatherStation = WeatherStation()

    //Create and register our displays (observers / subscribers)
    CurrentConditionsDisplay(weatherStation)
    ForecastDisplay(weatherStation)

    //Simulate updates
    for (i in 0 until 8) {
        println("\n--- Update $i ---")
        val randomTemp: Int = getRandomInt(-50, 40)
        val randomHumidity: Int = getRandomInt(0, 100)
        weatherStation.measurementsChanged(randomTemp, randomHumidity)
        Thread.sleep(1000)
    }
}

private fun getRandomInt(min: Int, max: Int): Int {
    val rand = Random()
    return rand.nextInt(max + 1 - min) + min
}