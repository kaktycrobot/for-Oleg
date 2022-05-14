abstract class AbstractWeapon(
    val maxAmmo: Int,
    val fireType: FireType,
    val magazine: Stack<Ammo>,
    var magazineIsEmpty: Boolean
) {
    abstract fun createPatron(ammo: Ammo)
    fun reload(add: Stack<Ammo>) {

    }
}