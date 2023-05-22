package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.jetbrains.compose.web.dom.*
import ui.CSS.AppStyleSheet

@Composable
fun Footer() {
    Footer {
        val tmp = AppStyleSheet.isDark.collectAsState()
        Button(
            attrs = {
                onClick {
                    AppStyleSheet.setColor()
                }
            },
        ) {
            if (tmp.value) {
                Text("Light")
            } else {
                Text("Dark")
            }
        }
    }
}
