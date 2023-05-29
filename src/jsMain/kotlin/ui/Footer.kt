package ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.HTMLElement
import ui.CSS.FooterStyleSheet

@Composable
fun Footer(
    isDark: State<Boolean>,
    isMouseOver: MutableState<Boolean>
) {
    Footer {
        Style(FooterStyleSheet)
        Div(attrs = { classes(FooterStyleSheet.c_footer_upper) }) {
            Span(attrs = {
                classes(
                    if(isMouseOver.value){
                        FooterStyleSheet.c_footer_switchText_isMouseOver
                    }else{
                        FooterStyleSheet.c_footer_switchText
                    }
                )
            }) {
                Text(
                    if (isDark.value) {
                        "光あれ"
                    } else {
                        "闇に飲まれる"
                    }
                )
            }
        }
        Switch(
            isDark = isDark,
            isMouseOver = isMouseOver
        )

    }
    Div {
        Div {
            P({ prop(HTMLElement::innerHTML::set, "&copy; 2023 sanao") })
        }
    }
}
