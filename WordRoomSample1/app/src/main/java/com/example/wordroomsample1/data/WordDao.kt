package com.example.wordroomsample1.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*

//@Dao
//interface WordDao {
//    @Query("SELECT * FROM word_table ORDER BY word ASC")
//    fun getAllWords(): LiveData<ArrayList<Word>>
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun insert(word: Word)
//
//    @Query("DELETE FROM word_table")
//    suspend fun deleteAll()
//}
//

@Dao
interface WordDao {
    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(word: Word): Long

    @Update
    suspend fun update(word: Word)

    @Delete
    suspend fun delete(word: Word)

}