package com.example.busschedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Using the @Entity decorator makes Room recognize that this class represents a database table
@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
    @NonNull @ColumnInfo(name = "stop_time") val stopTime: Int,
) {
}