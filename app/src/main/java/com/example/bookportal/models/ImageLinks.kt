package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageLinks(
    @SerialName(value = "smallThumbnail") val smallThumbnail: String,
    @SerialName(value = "thumbnail") val thumbnail: String,
)
