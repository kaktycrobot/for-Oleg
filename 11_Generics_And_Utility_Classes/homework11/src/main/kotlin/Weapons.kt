object Weapons {

    fun createPistol() = object : AbstractWeapon(
        maxAmmo = 12,
        fireType = FireType.SingleShot
    ) {
        override fun createPatron(): Ammo {
            return Ammo.PISTOLBULLET
        }
    }

    fun createRevolver() = object : AbstractWeapon(
        maxAmmo = 6,
        fireType = FireType.SingleShot
    ) {
        override fun createPatron(): Ammo {
            return Ammo.REVOLVERBULLET
        }
    }

    fun createSniperRifle() = object : AbstractWeapon(
        maxAmmo = 8,
        fireType = FireType.SingleShot,
    ) {
        override fun createPatron(): Ammo {
            return Ammo.SNIPERBULLET
        }
    }

    fun createAssaultRifle() = object : AbstractWeapon(
        maxAmmo = 30,
        fireType = FireType.Burst(3),
    ) {
        override fun createPatron(): Ammo {
            return Ammo.RIFLEBULLET
        }
    }
}
