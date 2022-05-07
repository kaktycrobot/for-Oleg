fun main() {

    val cards = listOf<BankCard>(
        DebitCard(0),
        CreditCard(10000),
        BonusDebitCard(),
        CreditCardCashback(),
        AccumulativeDebitCard()
    )

    fun getStarted() {
        var index = 0
        println("Hello! Get started!")
        Thread.sleep(2000)
        while (true) {
            println(
                """
            Select card:
            1. Debit card
            2. Credit card
            3. Bonus card
            4. Cashback credit card
            5. Accumulative card
            6. Exit
        """.trimIndent()
            )

            when (readLine()?.toIntOrNull() ?: 0) {
                0 -> println("Enter a valid value")
                1 -> index = 0
                2 -> index = 1
                3 -> index = 2
                4 -> index = 3
                5 -> index = 4
                6 -> break
            }
            while (true) {
                println(
                    """
            Select action:
            1. Top up the card
            2. Pay
            3. Get balance info
            4. Get available funds info
            5. Back
        """.trimIndent()
                )

                when (readLine()?.toIntOrNull() ?: 0) {
                    0 -> println("Enter a valid value")
                    1 -> cards[index].topUpTheCard()
                    2 -> cards[index].pay()
                    3 -> cards[index].getBalanceInfo()
                    4 -> cards[index].getAvailableFundsInfo()
                    5 -> break
                }
            }
        }
        Thread.sleep(1500)
        println("Goodbye!")
    }

    getStarted()
}