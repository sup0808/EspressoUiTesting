package com.demo.espressouitesting

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class util {

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

}