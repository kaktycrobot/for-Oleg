abstract class AbstractWarrior : Warrior {
    abstract val maxHealth : Int
    override var isKilled: Boolean = health <= 0
    abstract override val dodgeChance: Int
    abstract val accuracy: Int
    abstract val weapon : Weapons
    abstract var health : Int
    override fun atack(warrior: Warrior) {
        
    }

    override fun getDamage(damage: Int) {
        TODO("Not yet implemented")
    }
}