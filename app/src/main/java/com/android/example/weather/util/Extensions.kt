package com.android.example.weather.util

import com.android.example.weather.vo.City
import java.text.SimpleDateFormat
import java.util.*

fun Date.format(): String{
    val pattern = "dd/MMM/yyyy hh:mm a"
    val simpleDateFormat = SimpleDateFormat(pattern)
    return simpleDateFormat.format(this)
}

fun MutableList<City>.convertToListOfCityName() : MutableList<String> {

    val cityNameList: MutableList<String> = mutableListOf()

    for (city in this) {
        cityNameList.add(city.name)
    }

    return  cityNameList
}

fun Double.kelvinToCelsius() : Int {

    return  (this - 273.15).toInt()
}