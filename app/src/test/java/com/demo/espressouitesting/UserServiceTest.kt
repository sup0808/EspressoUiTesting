package com.demo.espressouitesting

import com.demo.espressouitesting.mock.LOGINSTATUS
import com.demo.espressouitesting.mock.UserRepository
import com.demo.espressouitesting.mock.UserService
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun SetUp(){
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUser(anyString(), anyString())).thenReturn(LOGINSTATUS.INVALID_PASSWORD)
    }

    @Test
    fun testUserService(){
        val sut = UserService(userRepository)
        val status = sut.loginUser("supriyag75@gmail.com","55")
        Assert.assertEquals("Password is invalid", status)
    }
}