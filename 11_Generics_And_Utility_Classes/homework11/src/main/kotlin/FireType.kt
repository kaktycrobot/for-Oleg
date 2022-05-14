sealed class FireType(val numberOfShots: Int) {
    object SingleShot : FireType(1)

    data class Burst(val burstSize: Int)
}