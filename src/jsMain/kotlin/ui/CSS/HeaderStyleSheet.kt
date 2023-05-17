package ui.CSS

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet: StyleSheet(AppStyleSheet) {
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
}