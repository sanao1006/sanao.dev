package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fields(
    @SerialName("category")
    val category: List<String?>? = null,
    @SerialName("content")
    val content: String?,
    @SerialName("title")
    val title: String,
    @SerialName("isZenn")
    val isZenn: Boolean,
    @SerialName("isQiita")
    val isQiita: Boolean,
    @SerialName("url")
    val url: String = "",
    @SerialName("slug")
    val slug: String
)