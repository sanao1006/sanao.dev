import app.softwork.routingcompose.HashRouter
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposableInBody
import ui.CSS.AppStyleSheet
import ui.MyWebSite

fun main() {
    renderComposableInBody {
        Style(AppStyleSheet)
        HashRouter("/") {
            MyWebSite()
        }
    }
}
