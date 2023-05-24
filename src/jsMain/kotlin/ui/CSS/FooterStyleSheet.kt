package ui.CSS

import org.jetbrains.compose.web.css.*

object FooterStyleSheet: StyleSheet(AppStyleSheet) {
    init {
        "footer" style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(AlignItems.Center)
            padding(32.px,0.px)
            flexGrow(0)
        }
    }
}