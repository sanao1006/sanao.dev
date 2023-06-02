package ui

import androidx.compose.runtime.*
import app.softwork.routingcompose.RouteBuilder
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Main
import ui.styles.AppStyleSheet
import ui.styles.ContentStyleSheet

@Composable
fun RouteBuilder.MyWebSite() {
    val isDark = AppStyleSheet.isDark.collectAsState()
    Style(ContentStyleSheet)
    Conteniner(isDark = isDark) {
        Main {
            route("posts") {
                PostList(isDark = isDark)
            }
            noMatch {
                Profile()
                Links(isDark = isDark)
            }
        }
    }
}

@Composable
fun Conteniner(
    isDark: State<Boolean> = AppStyleSheet.isDark.collectAsState(),
    content: @Composable () -> Unit
) {
    Header(isDark = isDark)
    content()
    Footer(isDark = isDark, isMouseOver = remember { mutableStateOf(false) })
}
