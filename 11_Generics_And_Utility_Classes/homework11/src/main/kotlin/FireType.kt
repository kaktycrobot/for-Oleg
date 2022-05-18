sealed class FireType {
    object SingleShot : FireType()

    data class Burst(val burstLength: Int) : FireType()
}