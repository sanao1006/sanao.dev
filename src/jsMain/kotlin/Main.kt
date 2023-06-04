import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposableInBody
import ui.styles.AppStyleSheet
import ui.MyWebSite

fun main() {
    renderComposableInBody {
        Style(AppStyleSheet)
        MyWebSite()
    }
}
