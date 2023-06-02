package ui.CSS

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object ContentStyleSheet : StyleSheet() {
    init {
        "main" style {
            maxWidth(1080.px)
            width(100.percent)
            flexGrow(1)
        }
    }

    val l_content by style {
        margin(0.px, auto as CSSNumeric)
        padding(0.px, 12.px, 0.px, 12.px)
        "article" style {
            padding(10.px, 0.px)
        }
    }

    val c_content_body by style {
        "h1,h2" style {
            property("border-bottom", "1px solid #757575")
        }
    }
}