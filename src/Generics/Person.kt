package Generics

class Person<T>(
    val id: T,
    val name: String
) {
    fun getData(): String {
        return "Name: $name - id: $id"
    }

    fun checkId (id: T, name: String) {
        if (this.id == id) println("Correct ID")
        else println("Wrong ID")
    }
}