package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable()
data class ContentfulDto(
    @SerialName("items")
    var items: List<Item>? = null,
    @SerialName("limit")
    var limit: Int? = null,
    @SerialName("skip")
    var skip: Int? = null,
    @SerialName("sys")
    var sys: SysXXXX? = null,
    @SerialName("total")
    var total: Int? = null
)