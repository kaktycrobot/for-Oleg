class CYPConverter : CurrencyConverter {
    override val currencyCode = "CYP"

    override fun convertToRub(value: Double) {
        println("$value $currencyCode = ${value * 125.98} RUB")
    }
}