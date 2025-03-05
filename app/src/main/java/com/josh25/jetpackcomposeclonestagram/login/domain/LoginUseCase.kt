package com.josh25.jetpackcomposeclonestagram.login.domain

import com.josh25.jetpackcomposeclonestagram.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String):Boolean {
        return repository.doLogin(user, password)
    }
}