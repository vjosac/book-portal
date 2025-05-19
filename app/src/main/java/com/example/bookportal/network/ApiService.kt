package com.example.bookportal.network

import com.example.bookportal.models.BookResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("volumes")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int = 25
    ): BookResponse
}