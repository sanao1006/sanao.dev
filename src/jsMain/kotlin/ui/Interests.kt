package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
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
                Li { Text("Kotlin, Nim, Haskell") }
                Li { Text("ソフトウェアアーキテクチャ") }
                Li { Text("関数型っぽいもの") }
                Li { Text("Android, JetpackCompose, KMM") }
                Li { Text("Misskey") }
                Li { Text("ノベルゲーム。ノベルゲームはいいぞ。") }
            }
        }
    }
}