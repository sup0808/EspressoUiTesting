package com.demo.espressouitesting

import kotlinx.coroutines.*

class util(private val dispatcher: CoroutineDispatcher) {

    suspend fun getUserName() : String{
        delay(10000)
        return "Supriya Gupta"
    }

    suspend fun getName() : String{
        CoroutineScope(Dispatchers.Main).launch{
            delay(10000)
        }

        return "user ---- Supriya Gupta"
    }

    suspend fun getAddress() : String{
        CoroutineScope(dispatcher).launch{ //runs on Dispatcher.IO
            delay(10000)
        }

        return "user ---- Supriya Gupta"
    }

}