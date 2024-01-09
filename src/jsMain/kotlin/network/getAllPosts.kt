package network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import model.Post
import model.PostsDto

suspend fun getAllPosts(): List<Post?> = withContext(Dispatchers.Default) {
    val response = request<Json>("https://scrapbox.io/api/pages/sanasana?limit=6&sort=created")
    val obj = Json.decodeFromString(PostsDto.serializer(), response.toString())
    console.log(obj.posts.toString())
    if(obj.posts.isNullOrEmpty()) return@withContext listOf()
    return@withContext obj.posts
}