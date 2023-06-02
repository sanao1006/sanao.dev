package ui.styles

import org.jetbrains.compose.web.css.*

object LinksStyleSheet : StyleSheet(ContentStyleSheet) {
    val c_links by style {
        "li" style {
            padding(4.px,0.px)
        }
        media(mediaMaxWidth(640.px)) {
            "ul" style {
                paddingLeft(20.px)
            }
        }
    }

    val c_link_color_dark by style {
        "li a" style {
            color(Color("#f39800"))
        }
    }

    val c_link_color_light by style {
        "li a" style {
            color(Color("#1a0dab"))
        }
    }
}