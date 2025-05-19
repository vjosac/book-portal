package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookResponse(
    @SerialName(value = "kind") val kind: String,
    @SerialName(value = "totalItems") val totalItems: Int,
    @SerialName(value = "items") val items: List<BookItem> = emptyList()
)
