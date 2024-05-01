package com.demo.espressouitesting.mock

class UserRepository {

    val users = listOf(
        User(1,"Supriya", "supriyag75@gmail.com","233"),
        User(2,"Arvind", "supriyag75@gmaicl.com","34"),
        User(3,"Shresth", "supriyag75@gmadddil.com","677")
    )

    fun loginUser(email: String , password : String) : LOGINSTATUS{
        val users = users.filter{user-> user.email == email}
        return if(users.size == 1){
            if(users[0].password == password){
             return   LOGINSTATUS.SUCCESS;
            } else {
                return  LOGINSTATUS.INVALID_USER;
            }
        }
        else{
            return  LOGINSTATUS.INVALID_PASSWORD;
        }
    }
}