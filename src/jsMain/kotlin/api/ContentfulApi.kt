package api

import model.ContentfulDto

interface ContentfulApi {
    suspend fun getAllPosts(): ContentfulDto
}
