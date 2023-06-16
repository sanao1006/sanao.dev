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
                Li { Text("Kotlin, Java, Scala, Haskell") }
                Li { Text("ソフトウェア設計、アーキテクチャ") }
                Li { Text("DDD") }
                Li { Text("GraphQL") }
                Li { Text("Android, JetpackCompose, KMP") }
                Li { Text("関数型みのあるもの") }
                Li { Text("Misskeyがすきー") }
                Li { Text("ノベルゲーム。ノベルゲームはいいぞ。") }
            }
        }
    }
}