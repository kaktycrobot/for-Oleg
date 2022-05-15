import kotlin.random.Random

fun main() {
//    val stackList = Stack<Int>()
//    println("is stack empty:" + stackList.isEmpty())
//    stackList.push(3)
//    stackList.push(2)
//    stackList.push(1)
//    println("the pop elements is : " + stackList.pop())
//    println("the pop elements is : " + stackList.pop())
//    println("is stack empty:" + stackList.isEmpty())
//    println("the pop elements is : " + stackList.pop())
//    println("is stack empty:" + stackList.isEmpty())
//    print(10)
//    print(80)
//    println(Ammo.SniperBullet.currentDamage())
//    println(Ammo.SniperBullet.currentDamage())
    val pistol = Weapons.createPistol()
    println("magazine is empty - ${pistol.magazine.isEmpty()}")
    pistol.reload()
    println("magazine is empty - ${pistol.magazine.isEmpty()}")
    pistol.magazine.pop()
        ?.let { println("damage - ${it.damage}, chance - ${it.criticalDamageChance}, ratio - ${it.ratio}, currdmg - ${it.currentDamage()}") }
    println("magazine is empty - ${pistol.magazine.isEmpty()}")
    pistol.magazine.pop()
        ?.let { println("damage - ${it.damage}, chance - ${it.criticalDamageChance}, ratio - ${it.ratio}, currdmg - ${it.currentDamage()}") }
    println("magazine is empty - ${pistol.magazine.isEmpty()}")
    pistol.magazine.pop()
        ?.let { println("damage - ${it.damage}, chance - ${it.criticalDamageChance}, ratio - ${it.ratio}, currdmg - ${it.currentDamage()}") }
}

fun Int.checkSuccess(): Boolean = this >= Random.nextInt(0, 100)
fun Int.checkSuccess1(): Boolean {
    return this >= Random.nextInt(0, 100)
}

fun print(chance: Int) {
    for (i in 1..100) {
        println("$i - ${chance.checkSuccess()}")
    }
}
