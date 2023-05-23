package ui.CSS

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet : StyleSheet(AppStyleSheet) {
    val isDark = AppStyleSheet.isDark.value
    val c_header by style {
        textAlign("center")
        fontSize(2.em)
        padding(32.px, 0.px)
        "a" style {
            textDecoration("underline")
            color(Color("#dcdcdc"))
            fontWeight("bold")
        }
    }

    init {
        c_header style {
            "a" style {
                if (isDark) {
                    color(Color("#dcdcdc"))
                } else {
                    color(Color("#202020"))
                }
            }
        }
    }
}