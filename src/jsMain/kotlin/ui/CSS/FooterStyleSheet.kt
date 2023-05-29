package ui.CSS

import org.jetbrains.compose.web.css.*

object FooterStyleSheet: StyleSheet() {
    init {
        "footer" style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(AlignItems.Center)
            padding(16.px,0.px)
            flexGrow(0)

        }
    }

    val c_footer_upper by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        "span" style {
            fontSize(12.px)
        }
    }

    val c_footer_switchText_isMouseOver by style {
        opacity(1)
    }
    val c_footer_switchText by style {
        opacity(0)
    }
}