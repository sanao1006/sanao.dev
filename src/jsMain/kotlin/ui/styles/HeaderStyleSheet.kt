package ui.styles

import org.jetbrains.compose.web.css.*

object HeaderStyleSheet : StyleSheet() {
    val c_header by style {
        textAlign("center")
        padding(32.px, 0.px)
        flexGrow(0)
        fontSize(1.2.em)
        "a" style {
            textDecoration("underline")
            fontWeight("bold")
        }
        "h1" style {
            margin(0.px)
        }
        "div" style {
            fontSize(24.px)
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            gap(24.px)
            marginTop(10.px)
        }
    }
    val c_headerColor_light by style{
        color(Color("#202020"))
    }

    val c_headerColor_dark by style{
        color(Color("#dcdcdc"))
    }
}