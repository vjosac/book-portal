package com.example.bookportal.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PanelizationSummary(
    @SerialName(value = "containsEpubBubbles") val containsEpubBubbles: Boolean,
    @SerialName(value = "containsImageBubbles") val containsImageBubbles: Boolean,
)
