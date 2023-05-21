package ui

import androidx.compose.runtime.*
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.RouteBuilder
import kotlinx.browser.document
import model.Meta
import model.Posts
import org.jetbrains.compose.web.dom.Article
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.get
import ui.CSS.ContentStyleSheet
import util.OriginalMetaTag


@Composable
fun RouteBuilder.PostList(contents: Posts) {
    Div(attrs = { classes(ContentStyleSheet.l_content) }) {
        var head = document.getElementsByTagName("head")[0]!!
        val meta = Meta
        val ogpMap: Map<String, String> = mapOf(
            "twitter:card" to "summary",
            "twitter:site" to "@sanao1006",
            "og:type" to "website",
            "og:title" to "sanao.dev",
            "og:description" to "",
            "og:url" to "${decodeURIComponent(js("location.href") as String)}"
        )
        SideEffect {
            head.innerHTML = OriginalMetaTag.meta
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
        for (post in contents.posts) {
            route("post") {
                string {
                    if (post.title == decodeURIComponent(it)) {
                        PostDetail(post = post, meta = meta)
                    }
                }
            }
            noMatch {

                Article {
                    Div {
                        Text(post.createAt.take(10))
                    }
                    NavLink(to = "/post/${post.title}") {
                        Text(post.title)
                    }
                }
            }
        }
    }
}

external fun decodeURIComponent(encodedURI: String): String
