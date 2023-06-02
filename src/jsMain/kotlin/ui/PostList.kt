package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import api.getAllPosts
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.RouteBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.Posts
import org.jetbrains.compose.web.dom.*
import ui.CSS.ContentStyleSheet
import ui.CSS.PostsContentStyleSheet


@Composable
fun RouteBuilder.PostList(isDark: State<Boolean>) {
    var contents by rememberSaveable { mutableStateOf(Posts()) }
    LaunchedEffect(Unit) {
        withContext(Dispatchers.Main) {
            contents = getAllPosts()
        }
    }
    Section(attrs = { classes(ContentStyleSheet.l_content) }) {
        Div {
            for (post in contents.posts) {
                route("post") {
                    string {
                        if (post.fields.slug == decodeURIComponent(it)) {
                            PostDetail(post = post)
                        }
                    }
                }

                noMatch {
                    H2 { Text("Posts") }
                    Article {
                        Div {
                            Text(post.createAt.take(10))
                        }
                        NavLink(
                            to = "post/${post.fields.slug}",
                            attrs = {
                                classes(
                                    if (isDark.value) {
                                        PostsContentStyleSheet.c_post_title_color_dark
                                    } else {
                                        PostsContentStyleSheet.c_post_title_color_light
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
}

external fun decodeURIComponent(encodedURI: String): String
