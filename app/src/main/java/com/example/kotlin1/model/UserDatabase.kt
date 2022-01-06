package com.example.kotlin1.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [User::class],
    version = 1
)
abstract class UserDatabase: RoomDatabase(){
    abstract fun userDao() : UserDao

    
    // 여러 인스턴스가 열리는 것 방지하기 위해 싱글톤으로 정의
    companion object{
        private var INSTANCE:UserDatabase? = null

        @Synchronized
        fun getDatabase(context:Context): UserDatabase?{
            //INSTANCE가 NULL일 경우
            return INSTANCE?: synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user-database"
                ).build()
                INSTANCE = instance
                return INSTANCE
            }
        }

        // 아래와 같이 쓰는 사람도 있다..
        //return Room.databaseBuilder(context.applicationContext, SearchKeywordDB::class.java, "search.db").fallbackToDestructiveMigration().build()

        // 또한 여기서 생성하지 않고, 접근할 때 마다 생성하는 경우도있다.

    }
}