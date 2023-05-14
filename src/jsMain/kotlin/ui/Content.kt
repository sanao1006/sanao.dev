package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import api.getAllPosts
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import model.Posts
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet
import kotlin.coroutines.EmptyCoroutineContext

@Composable
fun Content() {
    var contents by rememberSaveable { mutableStateOf(Posts()) }
    val scope = CoroutineScope(EmptyCoroutineContext)
    LaunchedEffect(contents) {
        scope.launch {
            contents = getAllPosts()
        }
    }
    Div(attrs = { classes(AppStyleSheet.l_content) }) {
        for (post in contents.posts) {
            Article {
                Div {
                    Text(post.createAt.take(10))
                }
                Text(post.title)
            }
        }
    }
}