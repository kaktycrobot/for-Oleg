class TV(val brand: String, val model: String, val diagonal: Int, val color: String = "Black") {

    constructor(descriptor: Pair<String, String>, diagonal: Int, color: String = "Black") : this(
        brand = descriptor.first,
        model = descriptor.second,
        diagonal = diagonal,
        color = color
    )

    var power = false
        private set

    fun switchOn() {
        println("TV on")
        power = true
    }

    fun switchOf() {
        println("TV off")
        power = false
    }
    var currentVolume = 0
        currentVolume = volumeChange(x: Int)
    fun volumeChange(changeValue: Int): Int {
        return currentVolume + changeValue
    }

    companion object {
        const val maxVolume = 100
    }
}
