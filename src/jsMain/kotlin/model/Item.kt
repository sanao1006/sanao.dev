package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @SerialName("fields")
    val fields: Fields?,
    @SerialName("metadata")
    val metadata: Metadata?,
    @SerialName("sys")
    val sys: Sys?
)