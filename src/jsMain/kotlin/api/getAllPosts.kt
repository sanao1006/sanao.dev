package api

import util.request
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import model.ContentfulDto
import model.Posts
import model.toPosts
import sanao.dev.BuildKonfig


suspend fun getAllPosts(): Posts = withContext(Dispatchers.Default) {
    val response = request<Json>("https://cdn.contentful.com/spaces/${BuildKonfig.SPACE_ID}/environments/master/entries?access_token=${BuildKonfig.API_KEY}")
    val obj = Json.decodeFromString(ContentfulDto.serializer(), response.toString()).toPosts()
    Posts(obj.posts)
}