fun main() {
    val battle = Battle()
    battle.toBattle()
}

fun Int.checkSuccess(): Boolean = this >= (0..100).random()