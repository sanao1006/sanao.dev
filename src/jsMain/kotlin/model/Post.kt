package model

data class Post(
    var metadata: Metadata?,
    var fields: Fields,
    var title: String,
    var createAt: String,
)
