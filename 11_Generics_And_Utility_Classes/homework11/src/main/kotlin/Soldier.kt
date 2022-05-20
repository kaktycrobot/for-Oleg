class Soldier : AbstractWarrior() {
    override val name = "Soldier"
    override val maxHealth = 110
    override val accuracy = 65
    override val weapon = when ((0..1).random()) {
        1 -> Weapons.createPistol()
        else -> Weapons.createUzi()
    }
    override val dodgeChance = 15
    override var health = maxHealth * (8..10).random() / 10
}