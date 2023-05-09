
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import ui.CSS.AppStyleSheet

fun main() {
    var count: Int by mutableStateOf(0)
    renderComposable(rootElementId = "root") {
        Style(AppStyleSheet)
        Div({ style { padding(25.px) } }) {
            ui.Header()

            Tx(count)


        }
    }
}

@Composable
fun Tx(cnt: Int){
    Text("now: $cnt")
}

