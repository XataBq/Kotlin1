package scope_func

// let, with, run, apply, also
// inline fun <T, R> T.let(block: (T) -> R): R
// inline fun <T, R> with(receiver: T, block: T.() -> R): R
// inline fun <T, R> T.run(block: T.() -> R): R
// inline fun T.apply(block: T.() -> Unit): T
// inline fun T.also(block: (T) -> Unit): T

fun main() {

    val sam = Person("Sam", email = "sam@gmail.com")
    sam.email?.let { println("Email: $it") }
    sam.email?.let (::println)
    sam.email?.let (::printEmail)

    val tom = Person("Tom", email = null)
    tom.email?.let { println("Email: $it") }

    val emailOfTom = with(tom) {
        if(email == null) email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom)

    val bob = Person("asd", 1111,null)
    with(bob) {
        name = "Bob"
        if(age !in 1..101) age = null
        if(email == null) email = "${name.lowercase()}@gmail.com"
    }

    val ted = Person("Ted", 12, "Ted@gmail.ru")

    val ted2: Person
    ted2 = ted.run {
        if (age !in 1..101) age = null
        if(email == null) email = "${name.lowercase()}@gmail.com"
        this
    }

    ted.run { name = "TEDY" }
    println(ted2.name) //TEDY - ted2 ссылка на ted

    val ted3: Person
    ted3 = ted
    ted.name = "TED1"
    println(ted3)
    println(ted2)
    println(ted)

    val mick = Person("Mick", 12, null)
    mick.apply {
        if(email == null) email = "${name.lowercase()}@gmail.com"
    }
    println(mick.email)

    val bobby = Employee()
    bobby.age(18)
    bobby.company("JetBrains")
    bobby.name("Bobby")
    println("${bobby.name} (${bobby.age}) - ${bobby.company}")

    val alsoTom = Person("Tommy", 19, null)

    alsoTom.also {
        if(it.email==null) it.email = "${it.name.lowercase()}@gmail.com"
    }
    println(alsoTom.email)
}

fun printEmail(email: String) {
    println("Email: $email")
}

class Person(var name: String, var age: Int? = 12, var email: String?)

data class Employee(var name: String = "", var age: Int = 0, var company: String = "") {
    fun age(age: Int): Employee = apply { this.age = age }
    fun name(name: String): Employee = apply { this.name = name }
    fun company(company: String): Employee = apply { this.company = company }
}