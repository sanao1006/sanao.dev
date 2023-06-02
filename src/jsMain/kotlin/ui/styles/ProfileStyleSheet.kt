package ui.styles

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object ProfileStyleSheet : StyleSheet(ContentStyleSheet) {
    val c_profile_icon by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        "img" style {
            borderRadius(50.percent)
            height(auto)
            maxWidth(100.px)
            cursor("pointer")
            media(mediaMaxWidth(640.px)) {
                self style {
                    width(80.px)
                }
            }
        }
        "span" style {
            marginTop(10.px)
            fontSize(19.4.px)
        }
    }

    val c_profile_text by style {
        media(mediaMaxWidth(640.px)) {
            "ul" style {
                paddingLeft(20.px)
            }
        }
    }
}