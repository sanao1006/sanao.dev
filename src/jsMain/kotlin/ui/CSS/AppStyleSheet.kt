package ui.CSS


import org.jetbrains.compose.web.css.*


object AppStyleSheet : StyleSheet() {
    init {
        "body, html" style {
            margin(0.px)
            height(100.percent)
        }
    }
}
