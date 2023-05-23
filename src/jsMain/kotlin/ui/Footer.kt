package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Footer
import org.jetbrains.compose.web.dom.Text
import ui.CSS.AppStyleSheet

@Composable
fun Footer(isDArk: State<Boolean>) {
    Footer {
        Button(
            attrs = {
                onClick {
                    AppStyleSheet.changeThemeColor()
                }
            },
        ) {
            if (isDArk.value) {
                Text("Light")
            } else {
                Text("Dark")
            }
        }
    }
}
