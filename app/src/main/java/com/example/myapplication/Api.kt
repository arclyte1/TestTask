package com.example.myapplication

import retrofit2.http.Body
import retrofit2.http.POST

interface Api {

    @POST(".")
    suspend fun sendToken(
        @Body body: SendTokenBody
    )
}