package lesson_11_12

fun main() {

    val dish1 = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2 = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

//    val ingredient1 = Ingredient("Картошка", 100, 1)
    val ingredient2 = Ingredient("Морковь", 50, 2, true)
//    println(ingredient1.name)
    println(ingredient2.name)

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Блюда из яиц"
//    dish1.inFavorites = true
//    println(dish1.category)
//    println(dish1.inFavorites)

//    println("Действия для блюда Яичница")
//    dish1.addToFavorites()
//    println(dish1.inFavorites)
//    dish1.startCooking()
//
//    println()
//
//    println("Действия для блюда Суп лапша")
//    dish2.addToFavorites()
//    println(dish2.inFavorites)
//    println(dish2.downloadIngredients())
//    dish2.removeFromFavorites()
//    println(dish2.inFavorites)

}