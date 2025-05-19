package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class VolumeInfo(
    @SerialName(value = "title") val title: String? = null,
    @SerialName(value = "subtitle") val subtitle: String? = null,
    @SerialName(value = "authors") val authors: List<String?>? = null,
    @SerialName(value = "publisher") val publisher: String? = null,
    @SerialName(value = "publishedDate") val publishedDate: String? = null,
    @SerialName(value = "description") val description: String? = null,
    @SerialName(value = "industryIdentifiers") val industryIdentifiers: List<IndustryIdentifier?>? = null,
    @SerialName(value = "readingModes") val readingModes: ReadingModes? = null,
    @SerialName(value = "pageCount") val pageCount: Int? = null,
    @SerialName(value = "printType") val printType: String? = null,
    @SerialName(value = "categories") val categories: List<String?>? = null,
    @SerialName(value = "maturityRating") val maturityRating: String? = null,
    @SerialName(value = "allowAnonLogging") val allowAnonLogging: Boolean? = null,
    @SerialName(value = "contentVersion") val contentVersion: String? = null,
    @SerialName(value = "panelizationSummary") val panelizationSummary: PanelizationSummary? = null,
    @SerialName(value = "imageLinks") val imageLinks: ImageLinks? = null,
    @SerialName(value = "language") val language: String? = null,
    @SerialName(value = "previewLink") val previewLink: String? = null,
    @SerialName(value = "infoLink") val infoLink: String? = null,
    @SerialName(value = "canonicalVolumeLink") val canonicalVolumeLink: String? = null,
)
