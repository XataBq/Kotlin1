package coroutines

import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

suspend fun main() = coroutineScope {
    val downloader: Job = launch {
        try {
            println("Начинаем загрузку файлов")
            for (i in 0..5) {
                println("Загружен файл $i")
                delay(500L)
            }
        } catch (e: CancellationException) {
            println("Загрузка прервана")
        } finally {
            println("Загрузка завершена")
        }
    }
    delay(800L) // установим задержку, чтобы несколько файлов загрузились
    println("Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...")
//    downloader.cancel()
//    downloader.join()
    downloader.cancelAndJoin()
    println("Работа программы завершена")

    // создаем и запускаем корутину
    val message = async {
        getMessage2()
    }
    // отмена корутины
    message.cancelAndJoin()

    try {
        // ожидаем получение результата
        println("message: ${message.await()}")
    }
    catch (e:CancellationException){
        println("Coroutine has been canceled")
    }
    println("Program has finished")

}

suspend fun getMessage2() : String{
    delay(500L)
    return "Hello"
}