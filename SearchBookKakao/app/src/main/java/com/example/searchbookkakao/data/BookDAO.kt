package com.example.searchbookkakao.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDAO {

    @Query("SELECT * FROM BOOK")
    fun getAllBook():Flow<ArrayList<Book>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBook(book:Book)

}