package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.*
import ui.styles.HeaderStyleSheet

@Composable
fun Header() {
    Header() {
        Style(HeaderStyleSheet)
        Div(attrs = {
            classes(
                HeaderStyleSheet.c_header,
            )
        }) {
            Text("sanao.dev")
        }
    }
}