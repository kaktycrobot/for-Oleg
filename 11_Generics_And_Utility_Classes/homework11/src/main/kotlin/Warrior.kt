interface Warrior {
    var isKilled : Boolean
    val dodgeChance : Int
    fun atack(warrior: Warrior)

    fun getDamage(damage : Int)
}