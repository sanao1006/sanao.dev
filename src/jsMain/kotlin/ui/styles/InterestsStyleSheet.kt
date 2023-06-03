package ui.styles

import org.jetbrains.compose.web.css.*

object InterestsStyleSheet: StyleSheet(ContentStyleSheet)  {
    val c_interests by style {
        margin(24.px, 0.px)
        lineHeight("1.3")
        "li" style {
            padding(4.px,0.px)
        }
        media(mediaMaxWidth(640.px)) {
            "ul" style {
                paddingLeft(20.px)
            }
        }
    }

}