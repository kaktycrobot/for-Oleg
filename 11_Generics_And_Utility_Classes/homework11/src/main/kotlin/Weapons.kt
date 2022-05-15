object Weapons {

    fun createPistol() = object : AbstractWeapon(
        maxAmmo = 12,
        fireType = FireType.SingleShot
    ) {
        override fun createPatron(): Ammo {
            return Ammo.PistolBullet
        }
    }

    fun createRevolver() = object : AbstractWeapon(
        maxAmmo = 6,
        fireType = FireType.SingleShot
    ) {
        override fun createPatron(): Ammo {
            return Ammo.RevolverBullet
        }
    }

    fun createSniperRifle() = object : AbstractWeapon(
        maxAmmo = 8,
        fireType = FireType.SingleShot,
    ) {
        override fun createPatron(): Ammo {
            return Ammo.SniperBullet
        }
    }

    fun createAssaultRifle() = object : AbstractWeapon(
        maxAmmo = 30,
        fireType = FireType.Burst(3),
    ) {
        override fun createPatron(): Ammo {
            return Ammo.RifleBullet
        }
    }
}
