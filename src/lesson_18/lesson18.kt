package lesson_18

import java.util.Date

fun main() {

    // ad hoc (по случаю )
    // subtyping ( полиморфизм включения )
    // parametric ( параметрический )

    val creationDate = Date()
    val note = NotesAppItem()

    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )
    println()

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        9097879664
    )
    println()

    val listItem: NotesAppItem = ListItem(
        "todoList",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "go to the shop")
    )

    val arrayOfNotes : Array<NotesAppItem> = arrayOf(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach { println(it.getItemData()) }
}