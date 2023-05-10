package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Environment(
    @SerialName("sys")
    val sys: SysX?
)