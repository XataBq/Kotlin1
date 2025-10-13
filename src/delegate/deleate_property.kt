package delegate
import kotlin.reflect.KProperty
//val/var имя_свойства: тип_данных by выражение
//После типа данных свойства идет ключевое слово by, после которого указывается выражение. Выражение представляет класс, который условно
//называется делегатом. Делегаты свойств могут не применять никаких интерфейсов, однако они должны предоставлять функции getValue() и
//setValue(). А выполнение методов доступа get() и set(), которые есть у свойства, делегируется функциям getValue() и setValue() класса
//делегата.

fun main() {
    val tom = Person("TOM", 21)
    println(tom.age)
    tom.age = 32
    println(tom.age)
    tom.age = -123
    println(tom.age )

}

class Person(val name: String, _age: Int) {
    var age: Int by LoggerDelegate(_age)
}

class LoggerDelegate(private var personAge: Int) {
    operator fun getValue(thisRef: Person, property: KProperty<*>): Int {
        return personAge
    }

    operator fun setValue(thisRef: Person, property: KProperty<*>, value: Int) {
        println("Устанавливаемое значение $value")
        if(value in 1..<110) personAge = value
    }
}