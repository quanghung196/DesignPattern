package com.example.designpattern.observer

class CurrentConditionsDisplay(weatherStation: Subject) : Observer {
    private var temp = 0
    private var humidity = 0

    override fun update(temp: Int, humidity: Int) {
        this.temp = temp
        this.humidity = humidity
        displayCurrent()
    }

    private fun displayCurrent() {
        println("Current Temperature: $temp")
        println("Current Humidity: $humidity")
    }

    init {
        weatherStation.registerObserver(this)
    }
}