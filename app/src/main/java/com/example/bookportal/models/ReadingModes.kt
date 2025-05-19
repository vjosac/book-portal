package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReadingModes(
    @SerialName(value = "text") val text: Boolean? = null,
    @SerialName(value = "image") val image: Boolean? = null,
)
