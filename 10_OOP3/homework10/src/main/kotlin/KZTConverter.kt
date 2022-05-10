class KZTConverter : CurrencyConverter {
    override val currencyCode = "KZT"

    override fun convertToRub(value: Double) {
        println("$value $currencyCode = ${value * 6.61} RUB")
    }
}