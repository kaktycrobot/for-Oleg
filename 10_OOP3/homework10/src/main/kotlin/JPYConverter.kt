class JPYConverter : CurrencyConverter {
    override val currencyCode = "JPY"

    override fun convertToRub(value: Double) {
        println("$value $currencyCode = ${value * 1.96} RUB")
    }
}