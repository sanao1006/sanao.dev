package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Post(
//    @SerialName("accessed")
    val accessed: Int?, // 1704435581
//    @SerialName("commitId")
    val commitId: String?, // 65489afcd0ab90001ba6414f
    @SerialName("created")
    val created: Int?, // 1679667855
//    @SerialName("descriptions")
    val descriptions: List<String?>?,
//    @SerialName("id")
    val id: String?, // 641db2887016f7001bb7c32f
//    @SerialName("image")
    val image: String?,
//    @SerialName("linked")
    val linked: Int?, // 0
//    @SerialName("pageRank")
    val pageRank: Int?, // 0
//    @SerialName("pin")
    val pin: Long?, // 9007197575072891
//    @SerialName("snapshotCreated")
    val snapshotCreated: Int?, // 1699256989
    @SerialName("title")
    val title: String?, // 管理人
//    @SerialName("updated")
    val updated: Int?, // 1699257084
//    @SerialName("user")
    val user: User?,
//    @SerialName("views")
    val views: Int? // 89
)