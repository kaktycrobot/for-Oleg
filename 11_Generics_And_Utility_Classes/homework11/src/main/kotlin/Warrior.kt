interface Warrior {
    val name: String
    val isKilled: Boolean
    val dodgeChance: Int
    fun attack(warrior: Warrior)

    fun getDamage(damage: Int)
}