package ui.CSS

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object ContentStyleSheet: StyleSheet(AppStyleSheet) {
    val l_content by style {
        maxWidth(800.px)
        margin(0.px, auto as CSSNumeric)
        padding(0.px, 10.px, 0.px, 10.px)
        "article" style {
            padding(8.px, 0.px)
        }
    }
}