package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccessInfo(
    @SerialName(value = "country") val country: String? = null,
    @SerialName(value = "viewability") val viewability: String? = null,
    @SerialName(value = "embeddable") val embeddable: Boolean? = null,
    @SerialName(value = "publicDomain") val publicDomain: Boolean? = null,
    @SerialName(value = "textToSpeechPermission") val textToSpeechPermission: String? = null,
    @SerialName(value = "epub") val epub: DocumentType? = null,
    @SerialName(value = "pdf") val pdf: DocumentType? = null,
    @SerialName(value = "webReaderLink") val webReaderLink: String? = null,
    @SerialName(value = "accessViewStatus") val accessViewStatus: String? = null,
    @SerialName(value = "quoteSharingAllowed") val quoteSharingAllowed: Boolean? = null,
)
