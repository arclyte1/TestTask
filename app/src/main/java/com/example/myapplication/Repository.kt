package com.example.myapplication

import javax.inject.Inject

class Repository @Inject constructor(
    private val api: Api
) {

    suspend fun sendToken(token: String) {
        try {
            api.sendToken(
                SendTokenBody(token)
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}