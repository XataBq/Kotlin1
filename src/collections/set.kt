package collections

// Интерфейс Set представляет неупорядоченный набор объектов, который хранит только уникальные объекты. Интерфейс Set
// представляет неизменяемый (immutable) набор. Set расширяет интерфейс Collection и соответственно все его методы.
// Для создания неизменяемого (immutable) набора используется функция setOf().

// union: объединение множеств
// intersect: пересечение множеств (возвращает элементы, которые есть в обоих множествах)
// subtract: вычитание множеств (возвращает элементы, которые есть в первом множестве, но отсутствуют во втором)

fun main () {
//    val numbers = setOf(5, 6, 7, 5, 6, 7)
//    val people = setOf("Tom", "Sam", "Bob", "Tom", "Sam", "Bob")

//    for (people in people) println(people)
//    println(people)

//    val people = listOf("Tom", "Bob", "Sam", "Tom", "Bob", "Alex")
//    val uniquePerson = people.toSet()
//    println(uniquePerson)

//    val people = setOf("Tom", "Sam", "Bob", "Mike")
//    val employees = setOf("Tom", "Sam", "Kate", "Alice")
//
//    val all = people.union(employees)
//
//    val common = people.intersect(employees)
//
//    val different = people.subtract(employees)
//
//    println(all)
//    println(common)
//    println(different)


    val numbers1: HashSet<Int> = hashSetOf(5, 6, 7)
    val numbers2: LinkedHashSet<Int> = linkedSetOf(25, 26, 27)

    val numbers: MutableSet<Int> = mutableSetOf(35, 36, 37)
    println(numbers.add(2))
    println(numbers.addAll(setOf(4, 5, 6)))
    println(numbers.remove(36))

    for (n in numbers){ println(n) }    // 35 37 2 4 5 6
    numbers.clear()
}