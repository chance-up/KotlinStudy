package com.example.wordroomsample1.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordDatabase : RoomDatabase(){
    abstract fun wordDao(): WordDao

    companion object {
        @Volatile
        private var INSTANCE:WordDatabase?=null

        fun getInstance(context: Context): WordDatabase {
            return INSTANCE ?: synchronized(WordDatabase::class) {
                INSTANCE ?: Room.databaseBuilder(context.applicationContext,
                    WordDatabase::class.java, "word_database").build().also { INSTANCE = it }
            }
        }
    }
}