package com.example.roomwordsample

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {
//    @Query("SELECT * FROM word_table ORDER BY word ASC")
//    fun getAlphabetizedWords(): List<Word>

    //fun getAlphabetizedWords(): LiveData<List<Word>>

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<ArrayList<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()

}