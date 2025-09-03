package lesson_15

fun main() {

    val upsilonShuttle = Upsilon(50)

    upsilonShuttle.runDiagnostic()
    upsilonShuttle.startEngine()
    upsilonShuttle.prepareForTakeOff()
    upsilonShuttle.reloadGuns()
    upsilonShuttle.startShooting()
    upsilonShuttle.prepareForLanding()

}