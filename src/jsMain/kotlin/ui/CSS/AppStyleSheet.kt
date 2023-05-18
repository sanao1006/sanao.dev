package ui.CSS


import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.web.css.*


object AppStyleSheet : StyleSheet() {
    init {
        "body, html" style {
            margin(0.px)
            height(100.percent)
            backgroundColor(Color("#383838"))
            color(Color("#fff"))
            fontFamily("Georgia,Cambria","Times,serif")
            fontSize(16.8.px)
            fontWeight(500)
        }
        "a" style {
            color(Color("#f39800"))
            textDecoration("none")
        }
    }
}
