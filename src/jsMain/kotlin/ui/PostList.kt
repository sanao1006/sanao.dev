package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import api.getAllPosts
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.Posts
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.CSS.ContentStyleSheet

@Routing
@Composable
fun RouteBuilder.PostList(isDark: State<Boolean>) {
    var contents by rememberSaveable { mutableStateOf(Posts()) }
    LaunchedEffect(Unit) {
        withContext(Dispatchers.Main) {
            contents = getAllPosts()
        }
    }
    Div(attrs = { classes(ContentStyleSheet.l_content) }) {
        for (post in contents.posts) {
            route("post") {
                string {
                    if (post.fields.slug == decodeURIComponent(it)) {
                        PostDetail(post = post)
                    }
                }
            }
            noMatch {
                Article {
                    Div {
                        Text(post.createAt.take(10))
                    }
                    NavLink(
                        to = "post/${post.fields.slug}",
                        attrs = {
                            classes(
                            if(isDark.value){ ContentStyleSheet.c_content_title_color_dark }
                            else { ContentStyleSheet.c_content_title_color_light }
                            )
                        }
                    ) {
                        Text(post.title)
                    }
                }
            }
        }
    }
}

external fun decodeURIComponent(encodedURI: String): String
