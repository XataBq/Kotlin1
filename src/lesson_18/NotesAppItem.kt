package lesson_18

import java.util.Date

open class NotesAppItem {

    open fun getItemData() = ""
}

class MessageItem(
    private val title: String,
    private val creationData: Date,
    private val type: String,
    private val data: String,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationData\nType: $type\nData: $data"
    }
}
class PhoneItem(
    private val title: String,
    private val creationData: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationData\nType: $type\nData: $data"
    }
}
class ListItem(
    private val title: String,
    private val creationData: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationData\nType: $type\nData: $data"
    }
}