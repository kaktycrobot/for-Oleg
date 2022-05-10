interface CurrencyConverter {
    val currencyCode: String
    fun convertToRub(value: Double)
}