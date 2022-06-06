package com.example.rezi

import retrofit2.http.GET


interface Api {
    @GET("/api/users")
    suspend fun getUsersList():UserResponse
}