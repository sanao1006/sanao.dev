package ui

import androidx.compose.runtime.Composable
import kotlinx.browser.document
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import ui.styles.ContentStyleSheet
import ui.styles.ProfileStyleSheet

@Composable
fun Profile() {
    Section(attrs = {
        classes(ContentStyleSheet.l_content)
    }) {
        H2 {
            Text("Whoami")
        }
        Div(attrs = { classes(ProfileStyleSheet.c_profile) }) {
            Div(attrs = {
                classes(ProfileStyleSheet.c_profile_icon)
            }) {
                Img(
                    src = "cardimage.jpg",
                    alt = "icon",
                    attrs = {
                        id("profImg")
                        onClick { rotateIcon() }
                    })
                Span { Text("sanao") }
            }
            Div(attrs = { classes(ProfileStyleSheet.c_profile_text) }) {
                Ul {
                    Li { Text("Android Developer") }
                    Li { Text("Japanese") }
                    Li { Text("Love MLB") }
                }
            }

        }
    }
}

fun rotateIcon() {
    val img = document.getElementById("profImg")
    img!!.classList.add("rotated")
    GlobalScope.launch {
        delay(1000L)
        img!!.classList.remove("rotated")
    }
}
