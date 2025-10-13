package coroutines

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main() {
    getUsers().collect{user -> println(user)}
    val numberFlow = getNumbers()
    println("number flow was created")
    println("launch collect function")
    numberFlow.collect{number -> println(number) }

    val numberFLow2: Flow<Int> = flowOf(1,2,3,4,5)
    numberFLow2.collect { num -> println(num) }
    val numberFlow3 = listOf("Apple", "Bananna", "Strawberry").asFlow()
    val numberFlow4 = (5..10).asFlow()

    numberFlow3.collect { fruit -> println(fruit) }
    val flowList = numberFlow4.toList()
    flowList.forEach {num -> println(num) }
}

fun getNumbers(): Flow<Int> = flow {
    for (item in 1..5){
        emit(item * item)
    }
}

fun getUsers(): Flow<String> = flow {
    val database = listOf<String>("Tom", "Bob", "Sam")
    var i = 1
    for (item in database) {
        delay(400L)
        println("Emit $i item")
        emit(item)
        i++
    }
}