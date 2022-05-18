abstract class AbstractWeapon(
    val maxAmmo: Int,
    val fireType: FireType
) {
    var magazine: Stack<Ammo> = Stack()
    var magazineIsEmpty: Boolean = magazine.isEmpty()

    abstract fun createPatron(): Ammo

    fun reload(): Stack<Ammo> {
        for (i in 1..maxAmmo) {
            magazine.push(createPatron())
        }
        println("Magazine is reloaded")
        return magazine
    }

    fun getPatronForShot(burstLength: Int): Stack<Ammo> {
        return if (!magazineIsEmpty) {
            when (fireType) {
                is FireType.SingleShot -> {
                    magazine.pop()
                    magazine
                }
                is FireType.Burst -> {
                    for (i in 1..fireType.burstLength) magazine.pop()
                    magazine
                }
            }
        } else {
            reload()
            magazine
        }
    }
}