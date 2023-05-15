package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import api.getAllPosts
import app.softwork.routingcompose.RouteBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import model.Posts
import kotlin.coroutines.EmptyCoroutineContext

@Composable
fun RouteBuilder.Content() {
    var contents by rememberSaveable { mutableStateOf(Posts()) }
    val scope = CoroutineScope(EmptyCoroutineContext)
    LaunchedEffect(contents) {
        scope.launch {
            contents = getAllPosts()
        }
    }

    PostList(contents = contents)

}
