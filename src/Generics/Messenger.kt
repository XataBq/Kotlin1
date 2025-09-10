package Generics

class Messenger<T>() where T: Message, T: Logger {
    fun send(mes:T) {
        println(mes.text)
    }
}