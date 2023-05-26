package ui

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import ui.CSS.ContentStyleSheet
import ui.CSS.ProfileStyleSheet

@Composable
fun Profile() {
    Section(attrs = {
        classes(ContentStyleSheet.l_content)
    }) {
            H2 {
                Text("Whoami")
            }
        Div {
            Div(attrs = {
                classes(ProfileStyleSheet.c_profile_icon)
            }) {
                Img(src = "cardimage.jpg", alt = "icon")
                Span { Text("sanao") }
            }
            Div {
                Ul {
                    Li { Text("日本のどこかで21年春からソフトウェアエンジニアやってます。") }
                    Li { Text("Web制作やWebシステム作成など、主に業務ではPHPとTypeScriptを使っています。") }
                    Li { Text("アイコンはなんかかわいかったので撮影した鳥。名前は知らない。") }
                }
            }

        }
    }
}