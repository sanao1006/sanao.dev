package ui

import androidx.compose.runtime.*
import model.Post
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.*
import ui.CSS.ContentStyleSheet

@Composable
fun PostDetail(post: Post) {
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
        prop(HTMLElement::innerHTML::set, post.fields.content!!)
    }
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