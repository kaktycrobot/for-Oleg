class Captain : AbstractWarrior() {
    override val name = "Captain"
    override val maxHealth = 150
    override val accuracy = 75
    override val weapon = when ((0..1).random()) {
        1 -> Weapons.createRevolver()
        else -> Weapons.createAssaultRifle()
    }
    override val dodgeChance = 30
    override var health = maxHealth * (8..10).random() / 10
}