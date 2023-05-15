package ui

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import model.Post
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLElement

@Routing
@Composable
fun RouteBuilder.PostDetail(post: Post) {
    Div({ prop(HTMLElement::innerHTML::set, post.fields.content!!) })
}