fun main() {
    val battle = Battle()
    battle.toBattle()
}
class NoAmmoException : Throwable(message = "Not enough ammo in magazine")
fun Int.checkSuccess(): Boolean = this >= (0..100).random()