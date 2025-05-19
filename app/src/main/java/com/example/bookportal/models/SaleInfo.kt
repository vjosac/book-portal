package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SaleInfo(
    @SerialName(value = "country") val country: String? = null,
    @SerialName(value = "saleability") val saleability: String? = null,
    @SerialName(value = "isEbook") val isEbook: Boolean? = null,
    @SerialName(value = "buyLink") val buyLink: String? = null,
)
