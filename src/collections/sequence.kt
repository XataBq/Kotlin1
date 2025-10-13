package collections

// Наряду с коллекциями Kotlin предоставляет еще один тип наборов элементов – последовательности (sequences).
// Последовательности предоставляют похожую функциональность, что и интерфейс Iterable, который реализуется типами
// коллекций. Ключевая разница состоит в том, как обрабатываются элементы последовательности при применении к ним набора
// операций.

fun main () {

//    val people = sequenceOf("Tom", "Sam", "Bob")
//    println(people.joinToString(" "))

    val employees = listOf("Tom", "Sam", "Bob")
    val people = employees.asSequence()
    println(people.joinToString(" "))

    var number = 0
    val numbers = generateSequence { number += 2; number }
    println(numbers.take(5).joinToString(" "))

    number = 0
    val numbers2 = generateSequence { number += 2; if(number > 8) null else number }
    println(numbers2.joinToString (" "))

    number = 0
    val numbers3 = generateSequence(1){ if(it > 25) null else it + 5}
    println(numbers3.joinToString (" "))

    val numbers4 = sequence {
        yield(1)
        yield(4)
        yield(7)
    }
    println(numbers4.joinToString())

    val numbers5 = sequence {
        var start = 0
        while(true) yield(start++)
    }
    println(numbers5.take(5).joinToString())

    val personal = sequence {
        val data = listOf("Alice", "Kate", "Ann")
        yieldAll(data)
    }
    println(personal.joinToString())
}