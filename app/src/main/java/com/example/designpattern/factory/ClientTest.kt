package com.example.designpattern.factory

fun main() {
    val car = CarFactory.getCandy(CarBrand.MERCEDES)
    println(car.getCarName())

    val car2 = CarFactory.getCandy(CarBrand.PORSCHE)
    println(car2.getCarName())

    val car3 = CarFactory.getCandy(null)
    println(car3.getCarName())
}