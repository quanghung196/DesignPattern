package com.example.designpattern.adapter

fun main() {
    val customer = BusinessAnalyst(Developer())
    customer.sendRequest("Work from home")
}