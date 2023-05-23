package ui.CSS

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object ContentStyleSheet : StyleSheet(AppStyleSheet) {
    val isDark = AppStyleSheet.isDark.value
    val l_content by style {
        maxWidth(800.px)
        margin(0.px, auto as CSSNumeric)
        padding(0.px, 10.px, 0.px, 10.px)
        "article" style {
            padding(10.px, 0.px)
        }
    }
    init {
        l_content style {
            "article a" style {
                if (isDark) {
                    color(Color("#f39800 !important"))
                } else {
                    color(Color("#1a0dab !important"))
                }
            }
        }
    }


    val c_content_title by style {
        textAlign("center")
        marginBottom(24.px)
        "h1" style {
            textAlign("center")
            margin(0.px, 0.px, 4.px, 0.px)
        }
    }

    val c_content_body by style {
        "h1,h2" style {
            property("border-bottom", "1px solid #757575")
        }
    }
}