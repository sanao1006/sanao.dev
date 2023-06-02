package ui.styles

import org.jetbrains.compose.web.css.*


object PostsContentStyleSheet: StyleSheet(ContentStyleSheet) {
    val c_post_title_color_dark by style {
        color(Color("#f39800"))
    }

    val c_post_title_color_light by style {
        color(Color("#1a0dab"))
    }

    val c_post_title by style {
        textAlign("center")
        marginBottom(24.px)
        "h1" style {
            textAlign("center")
            margin(0.px, 0.px, 4.px, 0.px)
        }
    }

}

