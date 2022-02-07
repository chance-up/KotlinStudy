package com.example.wordroomsample1.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0L,
    @ColumnInfo(name="word")
    var word:String
)