package ui.CSS

import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.compose.web.css.*
import org.w3c.dom.asList
import org.w3c.dom.get

object AppStyleSheet : StyleSheet() {
    val themeColor = window.matchMedia("(prefers-color-scheme: dark)").matches
    private val _isDark = MutableStateFlow(themeColor)
    val isDark: StateFlow<Boolean> = _isDark
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
            color(Color("#f39800"))
        }
    }

    fun setColor(){
        _isDark.value = !_isDark.value
        val body = document.getElementsByTagName("body")
        val atag = document.getElementsByTagName("a")
        if(_isDark.value){
        body[0]!!.classList.remove("darkTheme_body")
            body[0]!!.classList.add("lightTheme_body")
            atag.asList().forEach {
                if(it.classList.contains("darkTheme_a")){
                it.classList.remove("darkTheme_a")
                }
                it.classList.add("lightTheme_a")
            }
        }else{
            body[0]!!.classList.remove("lightTheme_body")
            body[0]!!.classList.add("darkTheme_body")
            atag.asList().forEach {
                if(it.classList.contains("lightTheme_a")){
                it.classList.remove("lightTheme_a")
                }
                it.classList.add("darkTheme_a")
            }
        }
    }
}
