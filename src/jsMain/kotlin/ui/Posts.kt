package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.Post
import network.getAllPosts
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.*
import ui.styles.ContentStyleSheet
import ui.styles.PostListStyleSheet

@Composable
fun PostList() {
    Section(attrs = { classes(ContentStyleSheet.l_content) }) {
        var posts by rememberSaveable { mutableStateOf(listOf<Post?>()) }
        LaunchedEffect(Unit) {
            withContext(Dispatchers.Main) {
            posts = getAllPosts()
            }
        }
        StyleSheet(PostListStyleSheet)
        H2 { Text("Posts") }
        Div(attrs = { classes(PostListStyleSheet.c_posts) }) {
            for (post in posts){
                A(href = "https://scrapbox.io/sanasana/${post?.title}") { Text(post?.title ?: "")  }
            }
        }
    }
}


