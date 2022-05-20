class General : AbstractWarrior() {
    override val name = "General"
    override val maxHealth = 200
    override val accuracy = 90
    override val weapon: AbstractWeapon = when ((0..1).random()) {
        1 -> Weapons.createRevolver()
        else -> Weapons.createSniperRifle()
    }
    override val dodgeChance = 40
    override var health = maxHealth * (8..10).random() / 10
}