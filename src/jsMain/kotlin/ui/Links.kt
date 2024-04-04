package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.*
import ui.styles.ContentStyleSheet
import ui.styles.LinksStyleSheet

@Composable
fun Links(isDark: State<Boolean>) {
    Section(attrs = { classes(ContentStyleSheet.l_content) }) {
        StyleSheet(LinksStyleSheet)
        H2 { Text("Links") }
        Div(attrs = { classes(LinksStyleSheet.c_links) }) {
            Ul(attrs = {
                classes(
                    if (isDark.value) {
                        LinksStyleSheet.c_link_color_dark
                    } else {
                        LinksStyleSheet.c_link_color_light
                    }
                )
            }) {
                Li { A(href = "https://github.com/sanao1006") { Text("Github") } }
                Li { A(href = "https://www.reddit.com/user/sanao1006/") { Text("Reddit") } }
                Li { A(href = "https://misskey.sanao.dev/@sanao") { Text("Misskey") } }
                Li { A(href = "https://twitter.com/sanao1006") { Text("X (Twitter)") } }
                Li { A(href = "https://scrapbox.io/sanasana/") { Text("Scrapbox") } }
                Li { A(href = "mailto:jinsei@sanao.dev") { Text("Mail") } }
                Li { A(href = "https://bsky.app/profile/bsky.sanao.dev") { Text("Bluesky") } }
                Li { A(href = "https://qiita.com/sanao_desu") { Text("Qiita") } }
                Li { A(href = "https://zenn.dev/sanao1000") { Text("Zenn") } }
            }
        }
    }
}
