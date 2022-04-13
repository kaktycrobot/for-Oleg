class TV(val brand: String, val model: String, val diagonal: Int, val color: String = "Black") {

    constructor(descriptor: Pair<String, String>, diagonal: Int, color: String = "Black") : this(
        brand = descriptor.first,
        model = descriptor.second,
        diagonal = diagonal,
        color = color
    )

    var powerOn = false
        private set

    fun switchOn() {
        println("TV on")
        powerOn = true
    }

    fun switchOf() {
        println("TV off")
        powerOn = false
    }

    var volume: Int = 0
    fun volumeUp() {

    }

    companion object {
        const val volumeMax = 100
    }

}
