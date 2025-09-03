package lesson_15

interface Movable {

    fun startEngine(){
        println("Двигатель запущен")
    }

    fun prepareForTakeOff ()
    fun prepareForLanding ()

}