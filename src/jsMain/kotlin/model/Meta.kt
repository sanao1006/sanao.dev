package model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import ui.decodeURIComponent

object Meta {
    var ogtype by mutableStateOf("")
    var ogtitle by mutableStateOf("")
    var ogdesc by mutableStateOf("")
}
