abstract class AbstractWeapon(
    val maxAmmo: Int,
    val fireType: FireType
) {
    var magazine: Stack<Ammo> = Stack()
    var magazineIsEmpty: Boolean = magazine.isEmpty()

    abstract fun createPatron() : Ammo

    fun reload(): Stack<Ammo> {
        for (i in 1..maxAmmo) {
            magazine.push(createPatron())
        }
        println("Magazine is reloaded")
        return magazine
    }
    fun getPatronForShot() {
        magazine.pop()
    }
}