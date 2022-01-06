package com.example.kotlin1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val id: String,
    val name: String,
    @PrimaryKey(autoGenerate = true)val index: Int = 0){
}