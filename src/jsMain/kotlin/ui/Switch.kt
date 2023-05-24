package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Label
import ui.CSS.AppStyleSheet

@Composable
fun Switch(
    isDark: State<Boolean>,
    isMouseOver: MutableState<Boolean>
){
    Div(attrs = {
        classes("toggle-container")
        onMouseEnter { isMouseOver.value = !isMouseOver.value }
        onMouseLeave { isMouseOver.value = !isMouseOver.value }
    }) {
        Input(
            type = InputType.Checkbox,
            attrs = {
                id("toggle")
                classes("toggle-checkbox")
                onChange { AppStyleSheet.changeThemeColor() }
                checked(isDark.value)
            }
        )
        Label(
            forId = "toggle",
            attrs = { classes("toggle-label") }
        )
    }
}