package ui

import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Main
import ui.styles.AppStyleSheet
import ui.styles.ContentStyleSheet

@Composable
fun MyWebSite() {
    val isDark = AppStyleSheet.isDark.collectAsState()
    Style(ContentStyleSheet)
    Conteniner(isDark = isDark) {
        Main {
                Profile()
                Interests()
                Links(isDark = isDark)
        }
    }
}

@Composable
fun Conteniner(
    isDark: State<Boolean> = AppStyleSheet.isDark.collectAsState(),
    content: @Composable () -> Unit
) {
    Header()
    content()
    Footer(isDark = isDark, isMouseOver = remember { mutableStateOf(false) })
}
