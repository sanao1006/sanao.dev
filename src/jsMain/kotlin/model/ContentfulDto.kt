package model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.intellij.markdown.flavours.commonmark.CommonMarkFlavourDescriptor
import org.intellij.markdown.html.HtmlGenerator
import org.intellij.markdown.parser.MarkdownParser

@Serializable()
data class ContentfulDto(
    @SerialName("items")
    var items: List<Item>? = null,
    @SerialName("limit")
    var limit: Int? = null,
    @SerialName("skip")
    var skip: Int? = null,
    @SerialName("sys")
    var sys: SysXXXX? = null,
    @SerialName("total")
    var total: Int? = null
)

fun ContentfulDto.toPosts(): Posts {
    return Posts(items!!.map {
        val flavour = CommonMarkFlavourDescriptor()
        val parsedTree = MarkdownParser(flavour).buildMarkdownTreeFromString(it.fields!!.content!!)
        val html = HtmlGenerator(it.fields!!.content!!,parsedTree,flavour).generateHtml()
        Post(
            metadata = it!!.metadata!!,
            fields = Fields(
                category = it.fields!!.category,
                title = it.fields!!.title,
                content = html
            ),
            title = it!!.fields!!.title!!,
            createAt = it.sys!!.createdAt!!
        )
    })
}