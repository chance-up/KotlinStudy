package com.example.searchbookkakao.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Book::class],
    version = 1,
    exportSchema = false
)
abstract class BookDatabase : RoomDatabase() {


    abstract val bookDao : BookDAO

    companion object{
        private var instance : BookDatabase?=null

        @Synchronized
        fun getInstance(context: Context): BookDatabase?{
            if(instance == null){
                synchronized(BookDatabase::class){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        BookDatabase::class.java,
                        "book-database"
                    )
                        .build()
                }
            }
            return instance
        }
    }

}