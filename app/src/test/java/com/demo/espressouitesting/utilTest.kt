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
import org.junit.Test

class utilTest {

    val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun testGetUser(){
        val utilObj = util(testDispatcher)
        runTest {
            utilObj.getAddress()
        }

    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
}