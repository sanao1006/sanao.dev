package ui

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import kotlinx.browser.document
import model.Meta
import model.Post
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.*
import ui.CSS.ContentStyleSheet
import util.OriginalMetaTag


@Composable
fun PostDetail(post: Post, meta: Meta) {
    SideEffect {
        Prism.highlightAll()

        var head = document.getElementsByTagName("head")[0]!!
        head.innerHTML = OriginalMetaTag.meta
        meta.ogtype = "article"
        meta.ogtitle = post.title
        meta.ogdesc = post.fields.description ?: ""
        val ogpMap: Map<String, String> = mapOf(
            "twitter:card" to "summary",
            "twitter:site" to "@sanao1006",
            "og:site_name" to "sanao.dev",
            "og:type" to "article",
            "og:title" to "${post.title}",
            "og:description" to "${post.fields.description ?: ""}",
            "og:url" to "${decodeURIComponent(js("location.href") as String)}"
        )
        ogpMap.forEach { (key, value) ->
            val metatag = document.createElement("meta")
            metatag.setAttribute(
                if (key.contains("twitter")) {
                    "name"
                } else {
                    "property"
                }, key
            )
            metatag.setAttribute("content", value)
            head.appendChild(metatag)
        }

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