package com.example.roomwordsample

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
//
//    fun getAlphabetizedWords():LiveData<List<Word>>{
//        return wordDao.getAlphabetizedWords()
//    }
    val allWords: LiveData<ArrayList<Word>> = wordDao.getAllWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}