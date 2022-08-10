package com.example.designpattern.singleton

fun main() {
    val singleton = LazyInitialization.getInstance()
    singleton.setName(name = "BQH@")
    println(singleton.getName())

    val singleton2 = LazyInitialization.getInstance()
    println(singleton2.getName())

}