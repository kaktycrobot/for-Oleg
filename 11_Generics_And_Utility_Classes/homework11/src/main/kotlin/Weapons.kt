object Weapons {
    fun createPistol() = object : AbstractWeapon(
        name = "Pistol",
        maxAmmo = 12,
        fireType = FireType.SingleShot,
        ammoType = Ammo.PISTOLBULLET
    ) {}

    fun createRevolver() = object : AbstractWeapon(
        name = "Revolver",
        maxAmmo = 6,
        fireType = FireType.SingleShot,
        ammoType = Ammo.REVOLVERBULLET
    ) {}

    fun createSniperRifle() = object : AbstractWeapon(
        name = "Sniper Rifle",
        maxAmmo = 8,
        fireType = FireType.SingleShot,
        ammoType = Ammo.SNIPERBULLET
    ) {}

    fun createAssaultRifle() = object : AbstractWeapon(
        name = "Assault Rifle",
        maxAmmo = 30,
        fireType = FireType.Burst(3),
        ammoType = Ammo.RIFLEBULLET
    ) {}

    fun createUzi() = object : AbstractWeapon(
        name = "Uzi",
        maxAmmo = 35,
        fireType = FireType.Burst(5),
        ammoType = Ammo.UZIBULLET
    ) {}
}
