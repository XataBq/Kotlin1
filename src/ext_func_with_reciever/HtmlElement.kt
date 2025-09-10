package ext_func_with_reciever

abstract class HtmlElement(val tagName: String) {
    val children = mutableListOf<HtmlElement>()
    var text: String = ""

    //Метод для добавления дочерних элементов
    fun <T : HtmlElement> doInit(element: T, init: T.() -> Unit) {
        element.init() //Выполняем лямбду получатель для настройки дочернего элемента
        children.add(element)
    }

    //Метод для рендеринга HTML
    open fun render(indent: String = "", level: Int = 0): String {
        val currentIndent = indent.repeat(level)
        val childIndent = indent.repeat(level + 1)
        val childrenHtml = children.joinToString("") {it.render(indent, level + 1)}

        return buildString {
            append("$currentIndent<$tagName>")
            if (text.isNotEmpty()) {
                append(text)
            }
            if (childrenHtml.isNotEmpty()) {
                append("\n")
                append(childrenHtml)
                append("\n$currentIndent")
            }
            append("</$tagName>\n")
        }
    }
}

class Html : HtmlElement("html") {
    fun head(init: Head.() -> Unit) = doInit(Head(), init)
    fun body(init: Body.() -> Unit) = doInit(Body(), init)
}

class Head : HtmlElement("head") {
    fun title(init: Title.() -> Unit) = doInit(Title(), init)
}

class Title : HtmlElement("title")

class Body : HtmlElement("body") {
    fun h1(init: H1.() -> Unit) = doInit(H1(), init)
    fun p(init: P.() -> Unit) = doInit(P(), init)
}

class H1 : HtmlElement("h1")
class P : HtmlElement("p")
