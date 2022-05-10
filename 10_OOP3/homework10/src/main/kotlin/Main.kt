fun main() {

    fun convertCurrency() {
        while (true) {
            println("Enter the currency in the format \"XXX\":")
            val receivedConverter = Converters.get(readln().toString())
            println("Enter value:")
            readLine()?.toDoubleOrNull()?.let { receivedConverter.convertToRub(it) }
            println("Convert yet?\nEnter \'y\' to yes or \'n\' to no.")
            when (readln()) {
                "y" -> continue
                "n" -> break
            }
        }
    }

    convertCurrency()

}