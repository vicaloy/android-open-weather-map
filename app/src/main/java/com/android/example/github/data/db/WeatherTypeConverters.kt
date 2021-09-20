

package com.android.example.github.data.db

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import timber.log.Timber
import java.text.SimpleDateFormat

@ProvidedTypeConverter
object WeatherTypeConverters {
    @TypeConverter
    fun fromTimestamp(timeStamp: Long?): String? {
        return timeStamp?.let { FORMATTER.format(timeStamp) }
    }

    @TypeConverter
    fun dateToTimestamp(timeStamp: String?): Long? {
        return timeStamp?.let { FORMATTER.parse(it)?.time }
    }

    val FORMATTER = SimpleDateFormat("dd-mmm-yyyy hh:mm:ss.s")

}
