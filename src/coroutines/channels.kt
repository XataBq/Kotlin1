package coroutines

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce

suspend fun main() = coroutineScope {
//    val channel = Channel<String>()
//    launch {
//        val users = listOf("Tom", "Bob", "Sam")
//        for (user in users) {
//            channel.send(user)
//        }
//        channel.close()
//    }
//    for(user in channel) {
//        println(user)
//    }

//    getUsers().consumeEach {
//        user -> println(user)
//    }
    val users = getUsers()
    users.consumeEach{user -> println(user)}

    println("End")
}

fun CoroutineScope.getUsers() : ReceiveChannel<String> = produce {
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user)
    }
}