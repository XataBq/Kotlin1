package filtration

// filter(predicate: (T) -> Boolean): List<T>/Map<K, V>/Sequence<T>

fun main () {
    var people = sequenceOf("Tom", "Sam", "Mike", "Bob", "Alice")
    people = people.filterNot { it.length == 3 }
//    people = people.filter { it.length == 3 }
    println(people.joinToString())

    val filtered = people.filterIndexed { index, s -> (index % 2 == 0) && (s.length == 3) }
    println(filtered.joinToString())

    var employees = listOf(
        Person("Tom", 32),
        Person("Bob", 41),
        Person("Sam", 25)
    )

    employees = employees.filter { it.age > 30 }
//    println(employees)
    val people2 = listOf(Person("Tom"), Person("Bob"),
        Employee("Sam"), Employee("Mike"),
        null, null
        )
    val employees2 = people2.filterIsInstance<Employee>()
    println(employees2)

    val employees3 = people2.filterNotNull()
    println(employees3)
}

open class Person(val name: String) {
    var age: Int = 0
    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

    override fun toString(): String = name
}
class Employee(name: String) : Person(name)
