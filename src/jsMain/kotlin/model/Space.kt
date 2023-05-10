package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Space(
    @SerialName("sys")
    val sys: SysX?
)