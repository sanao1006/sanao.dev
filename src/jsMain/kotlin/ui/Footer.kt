package ui

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.Footer

@Composable
fun Footer(isDark: State<Boolean>) {
    Footer {
        Switch()
    }
}