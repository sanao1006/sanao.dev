import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

fun main() {
    var count: Int by mutableStateOf(0)
    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            H1 { Text("Hellooo") }
            Tx(count)

        }
    }
}

@Composable
fun Tx(cnt: Int){
    Text("now: $cnt")
}

