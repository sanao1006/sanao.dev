package ui

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.RouteBuilder
import app.softwork.routingcompose.Routing
import org.jetbrains.compose.web.css.Style
import ui.CSS.AppStyleSheet

@Routing
@Composable
fun RouteBuilder.MyWebSite() {
    Style(AppStyleSheet)
    Conteniner {
        PostList()
    }
}

@Composable
fun Conteniner(content: @Composable () -> Unit) {
    Header()
    content()
    Footer()
}
