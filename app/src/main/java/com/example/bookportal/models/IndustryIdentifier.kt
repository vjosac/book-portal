package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IndustryIdentifier(
    @SerialName(value = "type") val type: String? = null,
    @SerialName(value = "identifier") val identifier: String? = null
)