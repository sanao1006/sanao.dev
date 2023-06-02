package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import model.Post
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement
import ui.styles.PostsContentStyleSheet

@Composable
fun PostDetail(post: Post) {
    SideEffect {
        Prism.highlightAll()
    }
    Div(attrs = {
        classes(PostsContentStyleSheet.c_post_title)
    }) {
        H1 {
            Text(post.title)
        }
        Text(post.createAt.take(10))
    }
    Div(attrs = {
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