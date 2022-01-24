package com.example.searchbookkakao.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class BookRepository(private val bookDao:BookDAO) {

    val allBook : Flow<ArrayList<Book>> = bookDao.getAllBook()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(book: Book){
        bookDao.insertBook(book)
    }
}