package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import app.softwork.routingcompose.NavLink
import app.softwork.routingcompose.Routing
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet
import ui.CSS.HeaderStyleSheet

@Routing
@Composable
fun Header(isDark: State<Boolean>) {
    Header() {
        Div(attrs = {
            classes(
                HeaderStyleSheet.c_header,
            )
        }) {
            NavLink(
                to = "/",
                attrs = {
                    classes(
                        if(isDark.value){ HeaderStyleSheet.c_headerColor_dark}
                        else{ HeaderStyleSheet.c_headerColor_light }
                    )
                }
            ) {
                Text("sanao.dev")
            }
        }
    }


}