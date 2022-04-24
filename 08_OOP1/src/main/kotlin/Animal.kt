import kotlin.random.Random

open class Animal(
    val name: String,
    var energy: Int,
    var weight: Int,
    val maxAge: Int = 12
) {
    var currentAge = (2..9).random()
    var isTooOld: Boolean = currentAge >= maxAge

    open fun move() {
        if (energy > 5 && weight > 1) {
            energy -= 5
            weight -= 1
            tryIncrementAge()
            println("$name moves")
        } else println("$name too weak")
    }

    fun eat() {
        energy += 3
        weight += 1
        tryIncrementAge()
        println("$name eats")
    }

    fun sleep() {
        energy += 5
        currentAge += 1
        println("$name sleeps")
    }

    open fun birth(): Animal {
        val newAnimal = Animal(
            name,
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxAge
        )
        println(
            "$name gives birth\n$name cub is born, its energy is ${newAnimal.energy}, " +
                    "its weight is ${newAnimal.weight}, its maximum age is ${newAnimal.maxAge}"
        )
        return newAnimal
    }

    private fun tryIncrementAge() {
        if (Random.nextBoolean()) {
            currentAge++
//            println("Random aging worked")
        }
    }

}