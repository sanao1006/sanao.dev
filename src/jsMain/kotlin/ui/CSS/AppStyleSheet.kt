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
        "a" style {
            textDecoration("none")
            color(Color.black)
            fontFamily("serif")
            fontWeight("bold")
        }
    }

    val l_content by style {
        maxWidth(800.px)
        margin(0.px, auto as CSSNumeric)
        padding(0.px, 10.px, 0.px, 10.px)
        "article" style {
            padding(8.px, 0.px)
        }
    }


}