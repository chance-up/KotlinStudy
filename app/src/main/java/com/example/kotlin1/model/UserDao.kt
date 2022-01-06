package com.example.kotlin1.model

import androidx.room.*
import com.example.kotlin1.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getUsers():List<User>

    @Query("SELECT * FROM User WHERE id = :id")
    fun getUser(id:String):User?

    // or
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user:User)
    @Update
    fun update(user:User)
    @Delete
    fun delete(user:User)


}