enum class Ammo(
    val damage: Int,
    val criticalDamageChance: Int,
    val ratio: Double
) {
    PISTOLBULLET(20, 40, 1.1),
    REVOLVERBULLET(60, 35, 2.5),
    SNIPERBULLET(80, 60, 1.50),
    RIFLEBULLET(50, 25, 1.95);
}

fun currentDamage(ammoType: Ammo): Int {
    if (ammoType.criticalDamageChance.checkSuccess()) return (ammoType.damage * ammoType.ratio).toInt()
    return ammoType.damage
}