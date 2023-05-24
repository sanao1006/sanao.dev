package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import app.softwork.routingcompose.RouteBuilder
import org.jetbrains.compose.web.dom.Main
import ui.CSS.AppStyleSheet

@Composable
fun RouteBuilder.MyWebSite() {
    val isDark = AppStyleSheet.isDark.collectAsState()
    Conteniner(isDark = isDark) {
        Main {
            PostList(isDark = isDark)
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
    Footer(isDark = isDark)
}
