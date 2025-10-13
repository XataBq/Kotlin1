package collections

// Коллекция Map представляет коллекцию объектов, где каждый элемент имеет ключ и сопоставляемое с ним значение.
// При этом все ключи в коллекции являются уникальными. В отличие от List и Set интерфейс Map не расширяет интерфейс Collection.

fun main () {

//    val people = mapOf(1 to "Tom", 5 to "Sam", 8 to "Bob")
//
//    for(person in people) {
//        println("${person.key} -- ${person.value}")
//    }
//    println(people)
//
//    val dictionary = mapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
//    val green = dictionary["green"]
//    val blue = dictionary.getOrDefault("blue", "Undefined")
//    val yellow = dictionary.getOrElse("yellow"){"Not found"}
//    println(dictionary.values)  // [красный, синий, зеленый]
//    println(dictionary.keys)
//
//    println(dictionary.containsKey("blue"))     // true
//    println(dictionary.containsKey("yellow"))  // false
//
//    println(dictionary.containsValue("желтый"))    // false
//    println(dictionary.containsValue("зеленый"))  // true

//    val people = mutableMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob")
    val people = mutableMapOf(1 to "Tom", 2 to "Sam", 3 to "Bob")

// добавляем один элемент с ключом 229 и значением Mike
    people.put(229, "Mike")
    println(people)     // {1=Tom, 2=Sam, 3=Bob, 229=Mike}

// добавляем другую коллекцию
    val employees = mapOf(301 to "Kate", 302 to "Bill")
    people.putAll(employees)
    println(people)     // {1=Tom, 2=Sam, 3=Bob, 229=Mike, 301=Kate, 302=Bill}

    people.set(1, "Tomas")
    println(people) // {1=Tomas, 2=Sam, 3=Bob}

    // изменяем элемент с ключом 1
    people[1] = "Tomas"
    println(people) // {1=Tomas, 2=Sam, 3=Bob}
// изменяем элемент с ключом 5
    people[5] = "Adam"
    println(people) // {1=Tomas, 2=Sam, 3=Bob, 5=Adam}

    // удаляем элемент с ключом 1
    people.remove(1)
    println(people) // {2=Sam, 3=Bob}

// удаляем элемент с ключом 3, если его значение - "Alice"
    people.remove(3, "Alice")
    println(people) // {2=Sam, 3=Bob}

// удаляем элемент с ключом 3, если его значение - "Bob"
    people.remove(3, "Bob")
    println(people) // {2=Sam}
}