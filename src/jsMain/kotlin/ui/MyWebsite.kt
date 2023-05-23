package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import org.jetbrains.compose.web.css.Style
import ui.CSS.AppStyleSheet

@Routing
@Composable
fun RouteBuilder.MyWebSite() {
    Style(AppStyleSheet)
    val isDark = AppStyleSheet.isDark.collectAsState()
    Conteniner(isDark = isDark) {
        PostList(isDark = isDark)
    }
}

@Composable
fun Conteniner(isDark:State<Boolean> = AppStyleSheet.isDark.collectAsState(),content: @Composable () -> Unit) {
    Header(isDark = isDark)
    content()
    Footer(isDark = isDark)
}
