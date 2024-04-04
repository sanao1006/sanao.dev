package ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.*
import ui.styles.ContentStyleSheet
import ui.styles.InterestsStyleSheet
import ui.styles.LinksStyleSheet

@Composable
fun Interests() {
    Section(attrs = { classes(ContentStyleSheet.l_content) }) {
        StyleSheet(LinksStyleSheet)
        H2 { Text("Interests") }
        Div(attrs = { classes(InterestsStyleSheet.c_interests) }) {
            Ul {
                Li { Text("Kotlin, Haskell") }
                Li { Text("Functional Programming") }
                Li { Text("Android") }
                Li { Text("Jetpack Compose") }
                Li { Text("Web") }
                Li { Text("Software design and architecture") }
                Li { Text("Misskey") }
                Li { Text("Baseball (NPB and MLB)") }
            }
        }
    }
}
