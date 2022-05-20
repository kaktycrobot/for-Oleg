enum class Ammo(
    val damage: Int,
    val criticalDamageChance: Int,
    val ratio: Double
) {
    PISTOLBULLET(20, 40, 1.1),
    REVOLVERBULLET(65, 35, 2.5),
    SNIPERBULLET(88, 60, 1.50),
    RIFLEBULLET(23, 25, 1.95),
    UZIBULLET(10,20, 1.2);
}

fun currentDamage(ammoType: Ammo): Int {
    if (ammoType.criticalDamageChance.checkSuccess()) return (ammoType.damage * ammoType.ratio).toInt()
    return ammoType.damage
}