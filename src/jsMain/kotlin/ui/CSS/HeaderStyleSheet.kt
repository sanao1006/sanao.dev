package ui.CSS

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet : StyleSheet(AppStyleSheet) {
    val c_header by style {
        textAlign("center")
        fontSize(2.em)
        padding(32.px, 0.px)
        "a" style {
            textDecoration("underline")
            fontWeight("bold")
        }
    }
    val c_headerColor_light by style{
        color(Color("#202020"))
    }

    val c_headerColor_dark by style{
        color(Color("#dcdcdc"))
    }
}