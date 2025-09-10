package extension_function

fun main() {

    val hello = "Hello World"
    println(hello.wordCount('l'))
    println(hello.wordCount('o'))
    println(4.square())
    println(6.square())

}

fun String.wordCount(c: Char): Int {
    var count = 0
    for (n in this) {
        if (n == c) count++
    }
    return count
}

fun Int.square (): Int {
    return this * this
}