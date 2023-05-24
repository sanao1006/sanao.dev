package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Footer
import ui.CSS.FooterStyleSheet

@Composable
fun Footer(isDark: State<Boolean>) {
    Footer {
        Style(FooterStyleSheet)
        Switch(isDark = isDark)
    }
}