class USDConverter : CurrencyConverter {
    override val currencyCode = "USD"

    override fun convertToRub(value: Double) {
        println("$value $currencyCode = ${value * 66.50} RUB")
    }
}