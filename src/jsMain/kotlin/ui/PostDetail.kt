package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import model.Post
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement
import ui.CSS.ContentStyleSheet

@Routing
@Composable
fun RouteBuilder.PostDetail(post: Post) {
    SideEffect {
        Prism.highlightAll()
    }
    Div(attrs = {
        classes(ContentStyleSheet.c_content_title)
    }) {
        H1 {
            Text(post.title)
        }
        Text(post.createAt.take(10))
    }

    Div(attrs = {
        classes(ContentStyleSheet.c_content_body)
        prop(HTMLElement::innerHTML::set, post.fields.content!!) }
    )
}

@JsName("Prism")
@JsModule("./prism.js")
@JsNonModule
external class Prism {
    companion object {
        fun highlightAll()
    }
}