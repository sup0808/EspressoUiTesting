package com.demo.espressouitesting

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class utilTest {

    @get:Rule
    val mainCoroutineRule : MainCoroutineRule = MainCoroutineRule()


    @Test
    fun testGetUser(){
        val utilObj = util(mainCoroutineRule.testDispatcher)
        runTest {
            utilObj.getAddress()
        }

    }
}