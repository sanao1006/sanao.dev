package ui.styles

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet : StyleSheet() {
    val c_header by style {
        textAlign("center")
        padding(32.px, 0.px)
        flexGrow(0)
        fontSize(2.em)
        textDecoration("underline")
        fontWeight("bold")

    }
    val c_headerColor_light by style {
        color(Color("#202020"))
    }

    val c_headerColor_dark by style {
        color(Color("#ffffff"))
    }
}