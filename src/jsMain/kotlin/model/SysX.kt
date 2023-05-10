package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SysX(
    @SerialName("id")
    val id: String?,
    @SerialName("linkType")
    val linkType: String?,
    @SerialName("type")
    val type: String?
)