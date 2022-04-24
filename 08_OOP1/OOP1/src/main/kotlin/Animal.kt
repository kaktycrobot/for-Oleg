import kotlin.random.Random

class Animal(var energy: Int, var weight: Int, val maxAge: Int, val name: String) {
    var currentAge = 0
    var isTooOld: () -> Boolean = { currentAge >= maxAge }

    fun moving() = run {
        energy -= 5
        weight -= 1
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        println("$name moves")
    }

    fun eat() = run {
        energy += 3
        weight += 1
        if (Random.nextBoolean()) {
            currentAge += 1
        }
        println("$name eats")
    }

    fun sleep() = run {
        energy += 5
        currentAge += 1
        println("$name sleeps")
    }

    fun tryIncrementAge(energy: Int, weight: Int) = run {
        if ((Random.nextBoolean()) && (isTooOld = true) ) {
            currentAge += 1
        }
    }

}