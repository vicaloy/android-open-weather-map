package com.android.example.weather.vo


import com.google.gson.annotations.SerializedName

data class Sys(
        @SerializedName("type")
        val type: Int = 0,
        @SerializedName("id")
        val id: Int = 0,
        @SerializedName("message")
        val message: Double = 0.0,
        @SerializedName("country")
        val country: String = "",
        @SerializedName("sunrise")
        val sunrise: Int = 0,
        @SerializedName("sunset")
        val sunset: Int = 0
)