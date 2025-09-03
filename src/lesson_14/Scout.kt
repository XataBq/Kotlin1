package lesson_14

class Scout (
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : SpaceShip(name, speed){

    fun handleDataFromradar() {
        println("${name}: обработка данных с радара")
    }

    fun runAfterburner() {
        println("${name}: форсаж запущен")
    }

}