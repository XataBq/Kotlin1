package lesson_20

import java.util.Calendar

fun main() {

    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear())

    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = {
        "print string with lambda $it"
    }

    println(printStringWithLambda(42));

    val someFunc = {it: Int -> println(it * 100)}
    someFunc(442)

    println({it: Int -> "print string with lambda 2 $it"} (442))

    val convertLambda = {endDays: Int -> println("Convert from lambda ${1000 * 60 * 60 * 24 * endDays}")}
    convertLambda(getDaysToEndYear())
}