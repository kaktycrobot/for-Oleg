import kotlin.random.Random

fun main() {
    val stackList = Stack<Int>()
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
    println(Ammo.SniperBullet.currentDamage())
    println(Ammo.SniperBullet.currentDamage())
    println(Ammo.SniperBullet.currentDamage())
    println(Ammo.SniperBullet.currentDamage())
    println(Ammo.SniperBullet.currentDamage())
    println(Ammo.SniperBullet.currentDamage())
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
