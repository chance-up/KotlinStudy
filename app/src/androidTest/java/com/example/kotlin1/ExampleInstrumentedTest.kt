package com.example.kotlin1

import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.kotlin1.model.UserDao
import com.example.kotlin1.model.UserDatabase

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before


import androidx.room.Room
import com.example.kotlin1.model.User
import org.junit.After
import java.io.IOException

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var userDao:UserDao
    private lateinit var db: UserDatabase

    @Before
    fun createDB(){
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context,UserDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        userDao = db.userDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    fun insertAndGetUser() {
//        val user = User("chansub","ccs6473")
//        userDao.insert(user)
//
//        val thisUser = userDao.getUser("chansub")
//        assertEquals(thisUser?.id,"chansub")
    }
}