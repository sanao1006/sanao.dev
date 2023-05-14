import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import ui.CSS.AppStyleSheet
import ui.Content

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        ui.Header()
        Content()
    }
}
