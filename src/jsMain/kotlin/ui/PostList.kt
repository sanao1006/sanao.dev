package ui

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.Parameters
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import model.Posts
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet


@Composable
fun RouteBuilder.PostList(contents: Posts) {
    Div(attrs = { classes(AppStyleSheet.l_content) }) {
        for (post in contents.posts) {
            Article {
                route("post") {
                    PostDetail(post = post)
                }
                noMatch {
                    Div {
                        Text(post.createAt.take(10))
                    }
                    NavLink(to = "/post") {
                        Text(post.title)
                    }
                }
            }
        }
    }
}