package lesson_1_10

fun main() {
    val name = getName()
    val age = getAge()
    printNameAndAge(userName = name, userAge = age)
}

fun getName(): String? = readlnOrNull()

fun getAge(): Int? = readlnOrNull()?.toInt()

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Вас зовут $userName, вам $userAge лет.")
}
