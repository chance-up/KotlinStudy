//package com.example.searchbookkakao.network
//
//import android.content.Context
//import androidx.room.Room
//import com.example.searchbookkakao.data.Book
//import com.example.searchbookkakao.data.BookDatabase
//
//object DatabaseModule {
//
//    lateinit var instance : BookDatabase
//
////    init {
////        instance = Room.databaseBuilder(
////            context
////        )
////    }
//////        synchronized(BookDatabase::class){
//////
//////        }
//////    }
//    @Synchronized
//    fun getInstance(context : Context): BookDatabase?{
//        if(BookDatabase.instance == null){
//            synchronized(BookDatabase::class){
//                BookDatabase.instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    BookDatabase::class.java,
//                    "book-database"
//                )
//                    .build()
//            }
//        }
//        return BookDatabase.instance
//    }
////
////    @Synchronized
////    init {
////        private val roomDB = Room.databaseBuilder(
////
////        )
////    }
//
//
