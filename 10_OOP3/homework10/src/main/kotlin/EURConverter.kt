class EURConverter : CurrencyConverter {
    override val currencyCode = "EUR"

    override fun convertToRub(value: Double) {
        println("$value $currencyCode = ${value * 70.95} RUB")
    }
}