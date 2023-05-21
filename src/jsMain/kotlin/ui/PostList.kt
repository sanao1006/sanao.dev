package ui

import androidx.compose.runtime.*
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import model.Posts
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.CSS.ContentStyleSheet

@Routing
@Composable
fun RouteBuilder.PostList(contents: Posts) {
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
                    NavLink(to = "/post/${post.fields.slug}") {
                        Text(post.title)
                    }
                }
            }
        }
    }
}

external fun decodeURIComponent(encodedURI: String): String
