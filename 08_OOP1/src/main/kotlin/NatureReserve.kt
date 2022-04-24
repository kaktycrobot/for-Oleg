open class NatureReserve {
    var zoo = mutableListOf<Animal>(
        Animal("Wolf", (5..10).random(), (3..7).random()),
        Animal("Fox", (5..10).random(), (3..7).random(), 15),
        Animal("Rabbit", (5..10).random(), (3..5).random(), 15),
        Animal("Lion", (5..10).random(), (3..10).random(), 15),
        Bird("Colibri", (5..10).random(), (1..5).random(), 12),
        Bird("Eagle", (5..10).random(), (3..7).random(), 12),
        Bird("Pigeon", (5..10).random(), (2..5).random(), 12),
        Bird("Tit", (5..10).random(), (2..5).random(), 12),
        Bird("Stork", (5..10).random(), (3..7).random(), 12),
        Dog("Goofy", (5..10).random(), (2..6).random(), 10),
        Dog("Cerberus", (5..10).random(), (2..6).random(), 10),
        Fish("Gudgeon", (5..10).random(), (1..5).random(), 5),
        Fish("Swordfish", (5..10).random(), (3..6).random(), 5),
        Fish("Magicarp", (5..10).random(), (2..5).random(), 100)
    )

    open fun reserveLife() {
        println("Enter a number of cycles:")
        val n = readLine()?.toIntOrNull() ?: 0
        for (i in 0..n) {
            var birthNote = mutableListOf<Animal>()
            zoo.forEach {
                when ((1..4).random()) {
                    1 -> it.move()
                    2 -> it.eat()
                    3 -> it.sleep()
                    4 -> birthNote.add(it.birth())
                }
            }
            println("Birth note is:")
            birthNote.forEach { println("${it.name}") }
//            zoo = zoo.addAll(birthNote)
            zoo = zoo.filterNot { it.isTooOld }.toMutableList()

        }
        println("${zoo.size} animals left in the reserve")
    }
}
