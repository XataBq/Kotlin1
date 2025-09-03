package lesson_21

import java.io.File

val File.nameWithoutasdExtension: String
    get() = name.substringBeforeLast(".")

fun main() {

    val file = File("textFile.txt")
    file.writeToFileAndSend()

    println(file.nameWithoutasdExtension)
}

fun File.writeToFileAndSend() {

    val message = "some message to the file"
    createNewFile()
    writeText(message)
    println("message: \"$message\" added to file $name and send")

}