package com.josh25.jetpackcomposeclonestagram.login.data

import com.josh25.jetpackcomposeclonestagram.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password: String): Boolean{
        return api.doLogin(user, password)
    }
}