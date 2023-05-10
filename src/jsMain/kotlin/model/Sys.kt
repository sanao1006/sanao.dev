package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sys(
    @SerialName("contentType")
    val contentType: ContentType?,
    @SerialName("createdAt")
    val createdAt: String?,
    @SerialName("environment")
    val environment: Environment?,
    @SerialName("id")
    val id: String?,
    @SerialName("locale")
    val locale: String?,
    @SerialName("revision")
    val revision: Int?,
    @SerialName("space")
    val space: Space?,
    @SerialName("type")
    val type: String?,
    @SerialName("updatedAt")
    val updatedAt: String?
)