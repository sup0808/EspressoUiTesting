package com.demo.espressouitesting

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class utilTest {

    @Before
    fun setUp() {
    }

    @Test
    fun testGetUser(){
        val utilObj = util()
        runTest {
            utilObj.getUserName()
        }

    }

    @After
    fun tearDown() {
    }
}