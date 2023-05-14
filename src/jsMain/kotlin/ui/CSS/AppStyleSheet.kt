package ui.CSS


import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto


object AppStyleSheet : StyleSheet() {
    init {
        "body, html" style {
            margin(0.px)
            height(100.percent)
        }
    }

    val c_header by style {
        textAlign("center")
        fontSize(2.em)
        padding(32.px, 0.px)
    }

    val l_content by style {
        maxWidth(800.px)
        margin(0.px, auto as CSSNumeric)
        "article" style {
            padding(6.px, 0.px)
        }
    }


}