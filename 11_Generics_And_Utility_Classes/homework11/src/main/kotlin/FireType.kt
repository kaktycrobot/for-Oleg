sealed class FireType {
    object SingleShot : FireType() {}

    data class Burst(val burstLength: Int) : FireType() {
        fun getLength(): Int {
            return burstLength
        }
    }
}