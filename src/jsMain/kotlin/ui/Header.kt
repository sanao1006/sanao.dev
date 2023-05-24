package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import app.softwork.routingcompose.NavLink
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Text
import ui.CSS.HeaderStyleSheet

@Composable
fun Header(isDark: State<Boolean>) {
    Header() {
        Style(HeaderStyleSheet)
        Div(attrs = {
            classes(
                HeaderStyleSheet.c_header,
            )
        }) {
            NavLink(
                to = "/",
                attrs = {
                    classes(
                        if (isDark.value) {
                            HeaderStyleSheet.c_headerColor_dark
                        } else {
                            HeaderStyleSheet.c_headerColor_light
                        }
                    )
                }
            ) {
                Text("sanao.dev")
            }
        }
    }


}