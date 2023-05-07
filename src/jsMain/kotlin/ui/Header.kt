package ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet


@Composable
fun Header() {
    Header(){
        Div(attrs = {
            classes(AppStyleSheet.c_header)
        }) {

        Text("sanao.dev")
        }
    }


}