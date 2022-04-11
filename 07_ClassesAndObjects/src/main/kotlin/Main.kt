fun main() {
    val samsung = TV(descriptor = "Samsung" to "UE70TQW120SV", 70)
    val lg = TV(brand = "LG", model = "43UP75006LF", diagonal = 43, color = "White")


    fun printInfo(tv: TV) {
        println("Brand - ${tv.brand}, Model - ${tv.model}, Diagonal - ${tv.diagonal}, Color - ${tv.color}")
    }

    printInfo(samsung)
    printInfo(lg)

    samsung.switchOn()
    println(samsung.power)
    samsung.switchOf()
    println(samsung.power)


}