package lesson_1_10

fun main() {
//    val number1: Int
//    val number2: Float
//    number1 = 13
//    number2 = 13f
//    println(number1)
//    println(number2)
////    number1 = 12 - val нельзя переназначить
//
//    var number3: Int
//    number3 = 5
//    println(number3)
//    number3 = (number1 + number2).toInt()
//    println(number3)
//
//    val welcomeMessage = "Передаю привет!!!"
//    println(welcomeMessage)
//
//    val name = "Григорий"
//    val yearNum1 = 2000
//    val yearNum2 = 25
//    println("Привет, меня зовут $name, сегодня ${yearNum1 + yearNum2} год")
//
//    val multiString = """
//        Good evening!
//            Good afternoon!
//                Good morning!
//    """.trimMargin()
//    println(multiString)
//
//    val userAge = readln().toInt()
//    if (userAge >= lesson_1_10.AGE_OF_MAJORITY) {
//        println("Доступ разрешен")
//    } else if (userAge == 16 || userAge == 17) {
//        println("Частичный доступ разрешен")
//    } else {
//        println("Доступ запрещен")
//    }
//
//    val consoleNumber: String
//    when (readln().toInt()) {
//        10 -> consoleNumber = "Your Number is 10"
//        20 -> consoleNumber = "Your Number is 20"
//        else -> consoleNumber = "Another number"
//    }
//    println(consoleNumber)
//
//
//    val consoleAge = when (readln().toInt()) {
//        23 -> {
//            println("Ого, у нас одинаковый возраст")
//            "Your age is 23"
//        }
//
//        25 -> "Your age is 25"
//        else -> "Another age"
//    }
//    println(consoleAge)
//
//    println("Введите число")
//    var counter = readln().toInt()
//    var steps = 0
//    while (counter != 0) {
//        if (counter < 0)
//            counter++
//        else
//            counter--
//        steps += 1
//    }
//    println("Now counter is 0, your number was $steps")
//
//    counter = 12
//    do {
//        if (counter < 0)
//            counter++
//        else
//            counter--
//        print("$counter ")
//    } while (counter != 0)

    //диапоозоны (интервалы)
//    val range1: IntRange = 42..442
//    val range2: IntRange = 42 until 442
//    val range3: LongRange = 42L..442L
//    val range4: CharRange = 'a'..'z'
//    val range5: ClosedRange<Double> = 42.1..442.1
//    val range6: ClosedRange<Float> = 42.1f..442.1f
//
//    val range7: IntProgression = 42..442 step 2
//    val range8: IntProgression = 442 downTo 42 step 2
//
//    val a = 52 in range1
//    val b = 52 !in range1
//    println(a)
//    println(b)
//
//    for(i in 5 downTo 1){
//        if (i == 3 ){
//            println("Пользовательно нажал на кнопку \"Пропустить\"")
//            break
//            println("i = 3, i не будет выведена")
//            continue
//            return
//        }
//        println("Рекалма закончится через $i")
//        Thread.sleep(1000)
//    }
//
//    println("Продолжение программы вне цикла")

//    for (i in range2 step 8){
//        println(i)
//    }

    //Массив
//    val arrayOfIngredients: Array<String> = arrayOf("яйца", "помидор", "зелень", "соль", "перец")
//    val intArray1: IntArray = intArrayOf(4, 4, 2)
//    val charArray: CharArray = charArrayOf('a', 'b', 'c')
//
//    val intArray2 = intArrayOf(1, 2, 3, 4, 5)

//    println("Размер массива с ингредиентами: ${arrayOfIngredients.size}")

//    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])

//    arrayOfIngredients[4] = "Паприка"
//    println(arrayOfIngredients[4])
//    arrayOfIngredients.set(1, "Капуста")
//    println(arrayOfIngredients.get(1))

//    for (i in arrayOfIngredients) {
//        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
//    }

    //Коллекции
    // List
    // Set
    // Map - словарь

    // Фикс размер у массива
    // Array<T>, List<T>
    // Массивы оптимизированы для примитивов
    // Отличается процесс сравнения элементов

//    val list: List<Int> = listOf(4, 4, 2)
//    val list2: MutableList<Int> = mutableListOf(1, 2, 3)
//
//    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
//    println(mutableList)

//    mutableList.add(42)
//    println(mutableList)
//    mutableList.add(0, 42)
//    println(mutableList)
//    println(mutableList.contains(42))

//    println(mutableList.isEmpty())
//    println(mutableList.isNotEmpty())

//    println(mutableList.indexOf(42))
//    println(mutableList.lastIndexOf(42))

//    mutableList.reverse()
//    println(mutableList)
//    mutableList.sort()
//    mutableList.sortDescending()
//    println(mutableList)

//    mutableList.forEach { number: Int ->
//        println(number)
//    }

    // Интервал -> for
    // Коллекции -> forEach
    // break, continue - for

//    val mutableList2 = mutableList.filter { it == 42 }
//    mutableList2.forEach { println(it) }
//
//    val mutableList3 = mutableList2.map {it * 2}
//    mutableList3.forEach { println(it) }

}

const val AGE_OF_MAJORITY = 18