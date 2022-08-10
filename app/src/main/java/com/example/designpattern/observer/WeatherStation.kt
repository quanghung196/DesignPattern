package com.example.designpattern.observer

import java.util.function.Consumer

class WeatherStation : Subject {
    private val observers: MutableList<Observer>
    private var temp = 0
    private var humidity = 0

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        val observerIndex = observers.indexOf(observer) //Do I have this observer?
        if (observerIndex >= 0) {
            observers.removeAt(observerIndex)
        }
    }

    override fun notifyObservers() {
        observers.forEach(Consumer { observer: Observer ->
            observer.update(
                temp,
                humidity
            )
        })
    }

    fun measurementsChanged(temp: Int, humidity: Int) {
        this.temp = temp
        this.humidity = humidity
        notifyObservers()
    }

    init {
        observers = ArrayList()
    }
}