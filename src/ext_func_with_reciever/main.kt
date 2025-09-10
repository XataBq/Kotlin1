package ext_func_with_reciever
//fun someFunc (block: T.() -> Unit) {}
// T: тип получателя. Это означает, что функция block будет выполняться как если бы она была методом экземпляра типа T. Внутри лямбда-выражения block ключевое слово this будет ссылаться на экземпляр типа T.
//
//(): указывает, что функция block не принимает никаких аргументов
//
//-> Unit: указывает, что функция block не возвращает никакого значения.


//Разберем определение функции Person.configure:
//
//fun Person.configure: Это объявление функции расширения для класса Person. Это означает, что теперь у любого объекта Person будет доступен метод configure.
//
//block: Person.() -> Unit: Это тип параметра block. Он определяет лямбда-функцию
//
//Person.(): Указывает, что эта лямбда является функцией расширения с получателем Person. Это значит, что внутри тела этой лямбды ({ ... }) можно напрямую обращаться к свойствам и методам объекта Person (например, name, age, display()) без необходимости префикса this.
//
//-> Unit: Обозначает, что эта лямбда не возвращает никакого значения.
fun main() {
//    callFirstExample()

    val myHtmlDocument = html {
        head {
            title {
                text = "Моя первая страница на Kotlin DSL"
            }
        }
        body {
            h1 {
                text = "Добро пожаловать в Ktor HTML DSL!"
            }
            p {
                text = "Это демонстрация функций расширения с получателем."
            }
            p {
                text = "Они позволяют создавать очень выразительные и читабельные DSL."
            }
        }
    }

    println(myHtmlDocument.render(indent = "   "))

}

fun html(init: Html.() -> Unit) : Html {
    val html = Html()
    html.init()
    return html
}


fun callFirstExample() {

    val person1 = Person().configure {
        name = "Tom"
        age = 41
        company = "MyCorp"
    }

    val person2 = Person()
    person2.name = "Sam"
    person2.configure {
        age = 21
        company = "ClobalContest"
    }

    val person3 = Person()
    person3.configure { name = "Matt" }.configure { age = 32 }.configure { company = "MyCorp3" }

    person1.display()
    person2.display()

}

fun Person.configure(block: Person.() -> Unit): Person {
    block()
    return this
}

