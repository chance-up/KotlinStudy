package com.example.searchbookkakao.api

import com.example.searchbookkakao.data.BookResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface BookApi {
    /**
     * 책 검색
     */
    @GET("v3/search/book")
    suspend fun searchBook(
        @Query("query") searchValue: String,
        @Query("page") page: Int,
        @Query("size") size: Int,
    ): BookResponse
}