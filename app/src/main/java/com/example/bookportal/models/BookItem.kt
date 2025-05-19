package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookItem(
    @SerialName(value = "kind") val kind: String,
    @SerialName(value = "id") val id: String,
    @SerialName(value = "etag") val etag: String? = null,
    @SerialName(value = "selfLink") val selfLink: String,
    @SerialName(value = "volumeInfo") val volumeInfo: VolumeInfo? = null,
    @SerialName(value = "saleInfo") val saleInfo: SaleInfo? = null,
    @SerialName(value = "accessInfo") val accessInfo: AccessInfo? = null,
    @SerialName(value = "searchInfo") val searchInfo: SearchInfo? = null,
)
