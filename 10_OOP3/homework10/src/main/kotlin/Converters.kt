object Converters {
    private val converters = listOf(
        USDConverter(),
        EURConverter(),
        CYPConverter(),
        JPYConverter(),
        KZTConverter()
    )

    fun get(inputCurrencyCode: String): CurrencyConverter {
        converters.forEachIndexed { i, _ ->
            if (converters[i].currencyCode == inputCurrencyCode.uppercase()) return converters[i]
        }
        return object : CurrencyConverter {
            override val currencyCode = inputCurrencyCode
            override fun convertToRub(value: Double) =
                println("Unknown currency $currencyCode\nPlease try input again")
        }
    }
}

