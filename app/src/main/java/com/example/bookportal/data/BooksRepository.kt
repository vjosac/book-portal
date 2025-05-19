package com.example.bookportal.data

import com.example.bookportal.models.BookResponse
import com.example.bookportal.network.ApiService

interface BooksRepository {
    suspend fun searchBooks(search: String): BookResponse
}

class NetworkBooksRepository(
    private val apiService: ApiService
): BooksRepository {
    override suspend fun searchBooks(search: String): BookResponse {
        return apiService.searchBooks(search, maxResults = 26)
    }

}