package collections


//size: размер массива
//
//lastIndex: индекс последнего элемента массива, тоже самое, что и size - 1
//
//indices: диапазон индексов элементов массив

fun main () {
    val numbers = arrayOfNulls<Int>(4)
    val numbers1: Array<Int>
//    val people: Array<String>

    var i = 0;
    val number2: Array<Int> = Array(3) { i++ * 2 }

    val people = arrayOf("Tom", "Sam", "Kate", "Bob", "Alice")

    val first = people.get(0)
    val second = people[1]
    val tenth = people.getOrNull(9)
    val eleventh = people.getOrElse(10) {"Invalid index $it"}

    println(people.indices) //0..4

    people.forEachIndexed { i, p -> println("$i. $p") }

    i = 0
    val table: Array<Array<Int>> = Array(3){ Array(5){i++} }

    table.forEach {
        s ->
        s.forEach {
            l ->
            print("$l ")
        }
        println()
    }

}