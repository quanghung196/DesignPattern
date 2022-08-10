package com.example.designpattern.observer

interface Observer {
    fun update(temp: Int, humidity: Int)
}