package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchInfo(
    @SerialName(value = "textSnippet") val textSnippet: String? = null
)
