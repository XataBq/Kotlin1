package lesson_13

fun main() {
    // NullPointerException (NPE)
    // null
    val nullableString: String? = null

//    if (nullableString != null) println(nullableString.length)
//    else println("переменная хранит null")

    println(nullableString?.length)

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 91329
//    println(stringLength)

    val stringLength: Int = nullableString?.length ?: 1213

}
