package com.demo.espressouitesting

import kotlinx.coroutines.delay

class util {

    suspend fun getUserName() : String{
        delay(10000)
        return "Supriya Gupta"
    }
}