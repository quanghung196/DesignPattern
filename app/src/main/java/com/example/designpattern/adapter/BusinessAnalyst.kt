package com.example.designpattern.adapter

class BusinessAnalyst(private val developer: Developer) : Customer {
    override fun sendRequest(request: String) {
        println("Reading request ...")
        println(request)
        val info = translate(request)
        println("Sending info ...")
        developer.receiveRequest(info)
    }

    private fun translate(request: String): String {
        return "Create Zoom to $request"
    }
}