package Generics

fun main() {
    val tom: Person<Int> = Person(511, "Tom")
    val bob: Person<String> = Person("81 str", "Bob")

    println(tom.getData())
    println(bob.getData())
    println()

    display("one function three types")
    display(3)
    display(true)
    println()

    val arr1 = getBiggestArray(arrayOf(1, 2, 3, 4), arrayOf(1, 2, 3, 4, 5, 6))
    arr1.forEach { item -> print("$item ") }
    println()

    val arr2 = getBiggestArray(arrayOf(tom, bob), arrayOf(tom))
    arr2.forEach { item -> println(item.getData()) }
    println()

    val result1 = getBiggest(1, 2)
    println(result1)
    // Ошибка типа данных as и as you like не Number
//    val result2 = getBiggest("as", "as you like")
//    println(result2)
    println()

    val email1 = EmailMessage("Hello ${tom.name}. EmailMessage")
    val outlook = Messenger<EmailMessage>()
    outlook.send(email1)
    val sms1 = SmsMessage("Hello ${bob.name}. SmsMessage")
    send(sms1)
}

fun <T> display(obj: T) {
    println(obj)
}

fun <T> getBiggestArray (arr1: Array<T>, arr2: Array<T>) : Array<T> {
    if (arr1.size > arr2.size) return arr1
    return arr2
}

fun <T> getBiggest(a: T, b: T): T where T: Comparable<T>, T: Number {
    return if(a > b) a else b
}

fun<T> send(message: T) where T: Message, T: Logger{
    println(message.text)
}

interface Message { val text: String }
interface Logger { fun log() }

class EmailMessage(override val text: String): Message, Logger {
    override fun log() = println("Email: $text")
}
class SmsMessage(override val text: String): Message, Logger {
    override fun log() = println("Sms: $text")
}