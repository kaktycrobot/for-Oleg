enum class Ammo(
    val damage: Int,
    val criticalDamageChance: Int,
    val ratio: Double
) {
    PistolBullet(20, 40, 1.1),
    RevolverBullet(60, 35, 2.5),
    SniperBullet(80, 60, 1.50),
    RifleBullet(50, 25, 1.95);

    fun currentDamage(): Int {
        if (criticalDamageChance.checkSuccess()) return (damage * ratio).toInt()
        return damage
    }


}