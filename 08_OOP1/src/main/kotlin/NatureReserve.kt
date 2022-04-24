open class NatureReserve {
    var zoo = mutableListOf<Animal>(
        Animal("Wolf", (6..10).random(), (3..7).random(), 12),
        Animal("Fox", (6..10).random(), (3..7).random(), 13),
        Animal("Rabbit", (6..10).random(), (3..5).random(), 10),
        Animal("Lion", (6..10).random(), (3..10).random(), 11),
        Bird("Colibri", (6..10).random(), (1..5).random(), 8),
        Bird("Eagle", (6..10).random(), (3..7).random(), 8),
        Bird("Pigeon", (6..10).random(), (2..5).random(), 8),
        Bird("Tit", (6..10).random(), (2..5).random(), 8),
        Bird("Stork", (6..10).random(), (3..7).random(), 8),
        Dog("Goofy", (6..10).random(), (2..6).random(), 7),
        Dog("Cerberus", (6..10).random(), (2..6).random(), 7),
        Fish("Gudgeon", (6..10).random(), (1..5).random(), 5),
        Fish("Swordfish", (6..10).random(), (3..6).random(), 5),
        Fish("Magicarp", (6..10).random(), (2..5).random(), 100)
    )

    open fun reserveLife(number: Int) {
        for (i in 1..number) {
            if (zoo.size == 0) println("All animals dead")
            else {
                val iterator = zoo.iterator()
                while (iterator.hasNext()) {

                }
            }
            for ((index, animal) in zoo.withIndex()) {
                when ((1..4).random()) {
                    1 -> animal.move()
                    2 -> animal.eat()
                    3 -> animal.sleep()
                    4 -> zoo.add(zoo[index].birth())
                }
            }
//            zoo = zoo.filterNot { it.isTooOld }.toMutableList()
            zoo.removeAll { it.isTooOld }
            println("${zoo.size} animals left in the reserve")
        }
    }
}