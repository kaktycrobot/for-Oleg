abstract class AbstractWarrior : Warrior {
    abstract val maxHealth: Int
    override val isKilled: Boolean
        get() {
            return health <= 0
        }
    abstract val accuracy: Int
    abstract val weapon: AbstractWeapon
    abstract var health: Int
    override fun attack(warrior: Warrior) {
        println("$name goes into battle!")
        Thread.sleep(1500)
        if (weapon.magazineIsEmpty) {
            print("${weapon.name} magazine is empty. Reload..   ")
            weapon.reload()
        } else {
            weapon.getPatronForShot()
            println("$name Attacks the ${warrior.name} with a ${weapon.name}")
            Thread.sleep(1500)
            if (accuracy.checkSuccess() && !warrior.dodgeChance.checkSuccess()) {
                print("${warrior.name} took damage: ")
                when (weapon.fireType) {
                    is FireType.SingleShot -> {
                        warrior.getDamage(currentDamage(weapon.ammoType))
                    }
                    is FireType.Burst -> {
                        warrior.getDamage(currentDamage(weapon.ammoType) * (weapon.fireType as FireType.Burst).burstLength)
                    }
                }
            } else {
                println("Miss.")
                Thread.sleep(1500)
            }
        }
    }

    override fun getDamage(damage: Int) {
        health -= damage
        println("$damage pt.")
        if (isKilled) println("Is killed.")
        else println("Health left $health pt.")
        Thread.sleep(1500)
    }
}