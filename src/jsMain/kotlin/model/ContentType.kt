package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ContentType(
    @SerialName("sys")
    val sys: SysX?
)