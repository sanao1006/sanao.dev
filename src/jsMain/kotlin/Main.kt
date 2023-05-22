import app.softwork.routingcompose.HashRouter
import org.jetbrains.compose.web.renderComposableInBody
import ui.MyWebSite

fun main() {
    renderComposableInBody {
        HashRouter("/") {
            MyWebSite()
        }
    }
}
