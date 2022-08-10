package com.example.designpattern.factory

object CarFactory {
    fun getCandy(carBrand: CarBrand?): Car {
        return when (carBrand) {
            CarBrand.MERCEDES -> MercedesCar()
            CarBrand.PORSCHE -> PorscheCar()
            else -> throw IllegalArgumentException("This candy type is unsupported")
        }
    }
}