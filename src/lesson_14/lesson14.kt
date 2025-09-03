package lesson_14

fun main() {

    // название, скорость, беспилотник
    // варп режим, диагностика системы
    // разведчик, индустриальный

//    val ship1 = SpaceShip("ship1", 500)
//    ship1.runSystemDiagnostic()
//    ship1.switchToWarpMode()

    val scout1 = Scout("scout1", 750, 100, 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromradar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", 500, 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)


}