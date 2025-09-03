package lesson_15

abstract class SpaceShuttle : Movable, Shootable {
    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeOff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить орудия N")
    }

}