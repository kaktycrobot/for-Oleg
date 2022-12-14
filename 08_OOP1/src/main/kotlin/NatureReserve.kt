open class NatureReserve {
    private var zoo = mutableListOf(
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

    fun reserveLife(number: Int) {
        for (i in 1..number) {
            if (zoo.size == 0) {
                println("All animals dead")
                break
            } else {
                var a = 0
                while (a in 0 until zoo.size) {
                    when ((1..4).random()) {
                        1 -> zoo.elementAt(a).move()
                        2 -> zoo.elementAt(a).eat()
                        3 -> zoo.elementAt(a).sleep()
                        4 -> zoo.add(zoo.elementAt(a).birth())
                    }
                    a++
                }
                zoo.forEach {
                    if (it.isTooOld)
                        println("${it.name} died at the age of ${it.maxAge}")
                }
                zoo.removeAll { it.isTooOld }
            }
            zoo.removeAll { it.isTooOld }
        }
        println("${zoo.size} animals left in the reserve")
    }
}