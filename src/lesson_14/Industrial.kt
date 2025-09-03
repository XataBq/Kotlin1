package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : SpaceShip(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        println("${name}: сканирующие дроны запущены")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("${name}: запущена диагностика дронов и майнеров")
    }
}