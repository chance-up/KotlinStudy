package com.example.wordroomsample1.data

import android.util.Log
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


class WordRepository(private val wordDao: WordDao) {
    //private val appDBInstance = WordDatabase.getInstance().wordDao()

    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) = wordDao.insert(word)

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun select() = wordDao.getAllWords()
}