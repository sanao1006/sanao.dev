package ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.dom.*
import ui.CSS.ContentStyleSheet
import ui.CSS.LinksStyleSheet

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
            }){
                    Li { A(href = "https://github.com/sanao1006") { Text("Github") } }
                    Li { A(href = "https://blog.sanao.dev") { Text("Blog") } }
                    Li { A(href = "https://misskey.systems/@sanao") { Text("Misskey.systems") } }
                    Li { A(href = "https://misskey.dev/@sanao") { Text("Misskey.dev") } }
                    Li { A(href = "https://twitter.com/sanao1006") { Text("Twitter") } }
                    Li { A(href = "https://scrapbox.io/sanasana/") { Text("Scrapbox") } }
            }
        }
    }
}