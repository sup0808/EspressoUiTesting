package com.demo.espressouitesting.mock

 class UserService(private val userRepository: UserRepository){

     fun loginUser(email: String , password : String) : String{
         val status = userRepository.loginUser(email,password);
         return when(status){
             LOGINSTATUS.INVALID_USER -> "Inavlid user"
                 LOGINSTATUS.INVALID_PASSWORD -> "Password is invalid"
                 LOGINSTATUS.SUCCESS -> "success"
                 LOGINSTATUS.UNKNOWN_ERROR -> "error"
         }
     }
 }