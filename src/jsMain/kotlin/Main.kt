import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
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

