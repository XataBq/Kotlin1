package leesson_22

fun main() {

    //class vs data class
    // equals() - сравнение двух обьектов
    // hashCode() - уникальный код обьекта
    // toString() - строковое представление
    // copy() - копирование обьекта

    val word1: Word = Word("red", "красный")
    val word2: Word = Word("red", "красный")
    val word3: Word = Word("grey", "серый")
//    println(word1 == word2)
//    println(word2 == word3)

//    val word4 = word3.copy(translate = "правильный перевод белый")
//    println(word3)
//    println(word4)
//    println()

    println(word1.hashCode())
    println(word2.hashCode())

}

data class Word(
    val text: String,
    val translate: String,
)