package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fields(
    @SerialName("category")
    val category: List<String?>?,
    @SerialName("content")
    val content: String?,
    @SerialName("title")
    val title: String
)