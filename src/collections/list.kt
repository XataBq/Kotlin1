package collections

// List представляет последовательный список элементов. При этом List представляет неизменяемую (immutable) коллекцию,
// которая в основном только обеспечивает получение элементов по позиции.
// Интерфейс List расширяет интерфейс Collection, поэтому перенимает его возможности.

//Изменяемые списки представлены интерфейсом MutableList. Он расширяет интерфейс List и позволяют добавлять и удалять элементы. Данный интерфейс реализуется классом ArrayList.
//Для создания изменяемых списков можно использовать ряд методов:
//arrayListOf(): создает объект ArrayList
//mutableListOf(): создает объект MutableList

//add(index, element): добавлят элемент по индексу
//add(element): добавляет элемент
//addAll(collection): добавляет коллекцию элементов
//remove(element): удаляет элемент
//removeAt(index): удаляет элемент по индексу
//clear(): удаляет все элементы коллекции

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5) // List<Int>
    val people = listOf("Tom", "Sam", "kate", "Bob", "Alice")

//    for(people in people) println(people)
//    println(people)

//    val first = people.get(0)
//    val second = people.getOrElse(7) {"Invalid index $it"}
//    val third = people[2]
//    val tenth = people.getOrNull(10)
//    println(first)
//    println(second)
//    println(third)
//    println(tenth)

//    val subPeople = people.subList(1,4)
//    println(subPeople)

    var numbers1: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    numbers1.add(4)
    numbers1.clear()


    var numbers2: MutableList<Int> = mutableListOf(5, 6, 7)
    numbers2.add(12)
    numbers2.add(0,23)
    numbers2.addAll(0, listOf(-3, -2, -1))
    numbers2.removeAt(0)
    numbers2.remove(5)

    for (n in numbers2) {
        println(n)
    }



}