package lesson_11_12

class Ingredient (val name: String, val weight: Int, val count: Int) {

    var isNeedToPrepare = false
//    var name: String = "INGREDIENT"
//    var weight: Int = 1
//    var count: Int = 1

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
        this.isNeedToPrepare = isNeedToPrepare
    }

    init {
        println("Ингредиент создан")
    }

    // Вторичный конструктор
    // Первичный конструктор
    // блоки init
    // Тело вторичного конструктора
}