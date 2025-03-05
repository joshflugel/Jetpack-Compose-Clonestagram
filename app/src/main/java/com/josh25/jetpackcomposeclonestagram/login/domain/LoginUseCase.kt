package com.josh25.jetpackcomposeclonestagram.login.domain

import com.josh25.jetpackcomposeclonestagram.login.data.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private  val repository: LoginRepository) {
    // private val repository = LoginRepository() BAD! No DI!

    suspend operator fun invoke(user: String, password: String):Boolean {
        return repository.doLogin(user, password)
    }
}