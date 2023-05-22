package ui.CSS

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet: StyleSheet(AppStyleSheet) {
    val c_header by style {
        textAlign("center")
        fontSize(2.em)
        padding(32.px, 0.px)
        "a" style {
            textDecoration("underline")
            color(Color("#dcdcdc"))
            fontWeight("bold")
        }
        media("prefers-color-scheme", StylePropertyValue("dark")){
            "a" style {
                color(Color("#dcdcdc"))
            }
        }
        media("prefers-color-scheme", StylePropertyValue("light")){
            "a" style {
                color(Color("#202020"))
            }
        }
    }
}