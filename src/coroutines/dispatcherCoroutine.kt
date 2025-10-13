package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

suspend fun main() = coroutineScope {
    val thread = newSingleThreadContext("CustomThread")
    launch(thread) {
        println("Корутина выполняется на потоке: ${Thread.currentThread().name}")
    }
    thread.close()

    println("Функция main выполняется на потоке: ${Thread.currentThread().name}")
}