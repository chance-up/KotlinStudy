package com.example.searchbookkakao.network

import com.example.searchbookkakao.api.BookApi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetWorkModule {
    private const val BASE_URL:String = "https://dapi.kakao.com"
    val service:BookApi
    init{
        val interceptor = Interceptor{ it.proceed(
            it.request().newBuilder()
                .addHeader("Authorization","KakaoAK 00000000000")
                .build()
            )
        }

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        service = retrofit.create(BookApi::class.java)
    }
}