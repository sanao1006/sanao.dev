package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.css.Style
import ui.CSS.FooterStyleSheet

@Composable
fun Footer(isDark: State<Boolean>) {
    Style(FooterStyleSheet)
    Footer {
        Switch(isDark = isDark)
    }
}