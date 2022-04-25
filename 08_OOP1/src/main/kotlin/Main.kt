fun main() {
    val natureReserve = NatureReserve()

    println("Enter a number of cycles:")

    val number = readLine()?.toIntOrNull() ?: return

    natureReserve.reserveLife(number)
}