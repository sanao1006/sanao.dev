package ui

import androidx.compose.runtime.Composable
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.Routing
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Text
import ui.CSS.HeaderStyleSheet

@Routing
@Composable
fun Header() {
    Header() {
        Div(attrs = {
            classes(HeaderStyleSheet.c_header)
        }) {
            NavLink("/") {
                Text("sanao.dev")
            }
        }
    }


}