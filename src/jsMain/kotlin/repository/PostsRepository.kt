package repository

import model.ContentfulDto

interface PostsRepository {
    suspend fun getAllPosts(): ContentfulDto
}