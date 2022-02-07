package com.example.roomwordsample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordRoomDatabase :RoomDatabase(){
    abstract fun wordDao(): WordDao
    companion object {
        private var INSTANCE:WordRoomDatabase?=null

        fun getInstance(context: Context,scope: CoroutineScope): WordRoomDatabase {
            return INSTANCE ?: synchronized(WordRoomDatabase::class) {
                INSTANCE ?: Room.databaseBuilder(context.applicationContext,
                    WordRoomDatabase::class.java, "todo.db").build().also { INSTANCE = it }
            }
        }
    }
}

private class WordDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {

//    override fun onCreate(db: SupportSQLiteDatabase) {
//        private var INSTANCE:WordRoomDatabase?=null
//        super.onCreate(db)
//        INSTANCE?.let { database ->
//            scope.launch {
//                populateDatabase(database.wordDao())
//            }
//        }
//    }
//
//    suspend fun populateDatabase(wordDao: WordDao) {
//        // Delete all content here.
//        wordDao.deleteAll()
//
//        // Add sample words.
//        var word = Word("Hello")
//        wordDao.insert(word)
//        word = Word("World!")
//        wordDao.insert(word)
//
//        // TODO: Add your own words!
//    }
}
//
//    companion object {
//        @Volatile
//        private var INSTANCE: WordRoomDatabase? = null
//
//        fun getDatabase(context: Context): WordRoomDatabase {
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    WordRoomDatabase::class.java,
//                    "word_database"
//                ).build()
//                INSTANCE = instance
//                // return instance
//                instance
//            }
//        }
//    }

