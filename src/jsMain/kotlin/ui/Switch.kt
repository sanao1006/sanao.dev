package ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Label
import ui.CSS.AppStyleSheet

@Composable
fun Switch(){
    Div(attrs = { classes("toggle-container") }) {
        Input(
            type = InputType.Checkbox,
            attrs = {
                id("toggle")
                classes("toggle-checkbox")
                onChange { AppStyleSheet.changeThemeColor() }
            }
        )
        Label(
            forId = "toggle",
            attrs = { classes("toggle-label") }
        )
    }
}