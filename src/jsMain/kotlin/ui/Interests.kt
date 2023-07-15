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
                Li { Text("Haskell, Kotlin, TypeScript") }
                Li { Text("関数型言語") }
                Li { Text("圏論") }
                Li { Text("Web") }
                Li { Text("ソフトウェア設計、アーキテクチャ") }
                Li { Text("Misskeyがすきー。Blueskyもいいぞ") }
                Li { Text("ノベルゲーム。ノベルゲームはいいぞ。") }
                Li { Text("やきう") }
            }
        }
    }
}