package com.josh25.jetpackcomposeclonestagram.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName("success") val success: Boolean)  // redundant, success
