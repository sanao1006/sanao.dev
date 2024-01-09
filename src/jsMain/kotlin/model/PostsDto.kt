package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PostsDto(
//    @SerialName("count")
    val count: Int?, // 168
//    @SerialName("limit")
    val limit: Int?, // 6
    @SerialName("pages")
    val posts: List<Post?> = listOf(),
    @SerialName("projectName")
    val projectName: String?, // sanasana
//    @SerialName("skip")
    val skip: Int? // 0
)