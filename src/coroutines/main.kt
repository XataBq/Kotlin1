package coroutines

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
//    val job = launch (start = CoroutineStart.LAZY){
//        for (i in 0..5) {
//            delay(200L)
//            println(i)
//        }
//    }
//    delay(1000L)
//    println("Start")
//    job.start()
//    delay(300L)
//    println("End")

    val message: Deferred<String> = async(start = CoroutineStart.LAZY) { getMessage() }
    println("Program has finished")
    println("message: ${message.await()}") // Запуск и получение результата. Либо можно также где-то указать message.start(), тогда запуск перейдет туда
    println("Program has finished")
}

suspend fun getMessage(): String {
    println("HI!")
    return "Hello"
}