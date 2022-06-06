package com.example.rezi


import android.service.autofill.UserData
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("data")
    val data: List<Data>,
)