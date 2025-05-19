package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DocumentType(
    @SerialName(value = "isAvailable") val isAvailable: Boolean? = null,
    @SerialName(value = "acsTokenLink") val acsTokenLink: String? = null,
    @SerialName(value = "downloadLink") val downloadLink: String? = null,
)
