abstract class AbstractWeapon(
    val name: String,
    val maxAmmo: Int,
    val fireType: FireType,
    val ammoType: Ammo
) {
    var magazine: Stack<Ammo> = Stack()
    val magazineIsEmpty: Boolean
        get() {
            return magazine.isEmpty()
        }

    private fun createPatron(): Ammo {
        return ammoType
    }

    fun reload(): Stack<Ammo> {
        print("[")
        repeat(maxAmmo) {
            Thread.sleep(100)
            print("/")
            magazine.push(createPatron())
        }
        println("]\nMagazine is reloaded")
        Thread.sleep(1500)
        return magazine
    }

    fun getPatronForShot(): Stack<Ammo> {
        return when (fireType) {
            is FireType.SingleShot -> {
                magazine.pop()
                magazine
            }
            is FireType.Burst -> {
                repeat(fireType.burstLength) { magazine.pop() }
                magazine
            }
        }
    }
}