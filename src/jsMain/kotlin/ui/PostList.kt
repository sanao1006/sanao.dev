package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import api.getAllPosts
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.RouteBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.Posts
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.H2
import ui.CSS.ContentStyleSheet


@Composable
fun RouteBuilder.PostList(isDark: State<Boolean>) {
    var contents by rememberSaveable { mutableStateOf(Posts()) }
    LaunchedEffect(Unit) {
        withContext(Dispatchers.Main) {
            contents = getAllPosts()
        }
    }
    Style(ContentStyleSheet)
    Section(attrs = { classes(ContentStyleSheet.l_content) }) {
        H2 { Text("Recently Posts") }
        for (post in contents.posts) {
            route("post") {
                string {
                    if (post.fields.slug == decodeURIComponent(it)) {
                        PostDetail(post = post)
                    }
                }
                noMatch { }
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
                                if (isDark.value) {
                                    ContentStyleSheet.c_content_title_color_dark
                                } else {
                                    ContentStyleSheet.c_content_title_color_light
                                }
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
