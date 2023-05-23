package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet

@Composable
fun Footer() {
    Footer {
        val tmp = AppStyleSheet.isDark.collectAsState()
        Button(
            attrs = {
                onClick {
                    AppStyleSheet.changeThemeColor()
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
