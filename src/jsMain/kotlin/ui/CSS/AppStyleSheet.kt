package ui.CSS


import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.web.css.*


object AppStyleSheet : StyleSheet() {
    init {
        "body, html" style {
            margin(0.px)
            height(100.percent)
            fontFamily("Georgia,Cambria","Times,serif")
            fontSize(16.8.px)
            fontWeight(500)
        }
        "a" style {
            textDecoration("none")
        }
        media("prefers-color-scheme", StylePropertyValue("dark")){
            "body,html" style {
                backgroundColor(Color("#383838"))
                color(Color("#fff"))
            }
            "a" style {
                color(Color("#f39800"))
            }
        }
        media("prefers-color-scheme", StylePropertyValue("light")){
            "body,html" style {
                backgroundColor(Color("#f1f1f1"))
                color(Color("#333333"))
            }
            "a" style {
                color(Color("#1a0dab"))
            }
        }
    }
}
