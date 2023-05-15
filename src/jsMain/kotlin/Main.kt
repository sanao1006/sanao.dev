import androidx.compose.runtime.Composable
import app.softwork.routingcompose.HashRouter
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import ui.CSS.AppStyleSheet
import ui.Content
import ui.Header

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        MyWebSite()
    }
}

@Composable
fun MyWebSite() {
    Header()
    HashRouter("/") {
        Content()
    }
}
