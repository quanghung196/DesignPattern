package com.example.designpattern.singleton

class LazyInitialization private constructor() {

    private var name: String = "BQH"

    private object Holder {
        val INSTANCE = LazyInitialization()
    }

    companion object {
        @JvmStatic
        fun getInstance(): LazyInitialization {
            return Holder.INSTANCE
        }
    }

    fun getName(): String = name

    fun setName(name: String) {
        this.name = name
    }
}

