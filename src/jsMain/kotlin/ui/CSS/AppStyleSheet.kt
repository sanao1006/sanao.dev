package ui.CSS

import kotlinx.browser.document
import kotlinx.browser.sessionStorage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.jetbrains.compose.web.css.*
import org.w3c.dom.asList
import org.w3c.dom.get

object AppStyleSheet : StyleSheet() {
    private val _isDark = MutableStateFlow(
        when (sessionStorage.getItem("isDark") ?: "true") {
            "true" -> true
            else -> false
        }
    )
    val isDark: StateFlow<Boolean> = _isDark

    init {
        "body, html" style {
            margin(0.px)
            height(100.percent)
            fontFamily("Georgia,Cambria", "Times,serif")
            fontSize(16.8.px)
            fontWeight(500)
        }
        "a" style {
            textDecoration("none")
        }
        "body" style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            minHeight(100.vh)
            alignItems(AlignItems.Center)
        }
        initBodyColor()
    }

    private fun initBodyColor() {
        val body = document.getElementsByTagName("body")[0]!!
        if (_isDark.value) {
            body.classList.add("darkTheme_body")
        } else {
            body.classList.add("lightTheme_body")
        }
    }

    fun changeThemeColor() {
        val body = document.getElementsByTagName("body")[0]!!
        val aTags = document.getElementsByTagName("a")
        body.classList.remove(document.body!!.className)

        val bodyClass = if (_isDark.value) "lightTheme_body" else "darkTheme_body"
        body.classList.add(bodyClass)

        val themeClass = if (_isDark.value) "lightTheme_a" else "darkTheme_a"
        aTags.asList().forEach {
            it.classList.replace(
                themeClass, when (themeClass) {
                    "lightTheme_a" -> "darkTheme_a"
                    else -> "lightTheme_a"
                }
            )
        }
        _isDark.value = !_isDark.value
        sessionStorage.setItem("isDark", _isDark.value.toString())
    }
}
