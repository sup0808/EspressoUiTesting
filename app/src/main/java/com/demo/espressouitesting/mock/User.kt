package com.demo.espressouitesting.mock

data class User(
    val id : Int,
    val name : String,
    val email : String,
    val password : String
)

enum class LOGINSTATUS{
    INVALID_USER ,
    INVALID_PASSWORD ,
    UNKNOWN_ERROR,
    SUCCESS
}