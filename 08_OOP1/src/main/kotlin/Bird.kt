import kotlin.random.Random

class Bird(
    name: String,
    energy: Int,
    weight: Int,
    maxAge: Int
) : Animal(name, energy, weight, maxAge) {
    override fun move() {
        super.move()
        println("$name is flying")
    }

    override fun birth(): Bird {
        val newAnimal = Bird(
            name,
            energy = (1..10).random(),
            weight = (1..5).random(),
            maxAge
        )
        println("$name gives birth\n$name cub is born, its energy is ${newAnimal.energy}, " +
                "its weight is ${newAnimal.weight}, its maximum age is ${newAnimal.maxAge}")
        return newAnimal
    }
}



