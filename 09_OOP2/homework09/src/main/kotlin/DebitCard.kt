open class DebitCard(balance: Int) : BankCard(balance) {
    override fun topUpTheCard() {
        println("How much do you want to deposit?")
        val replenishmentAmount = readLine()?.toIntOrNull() ?: 0
        balance += replenishmentAmount
    }

    override fun pay() {
        println("Payment amount:")
        val paymentAmount = readLine()?.toIntOrNull() ?: 0
        if (paymentAmount > balance) println("Insufficient funds")
        else balance -= paymentAmount
    }

    override fun getBalanceInfo() {
        println("\"DEBIT CARD\" balance: $balance")
    }

    override fun getAvailableFundsInfo() {
        println("\"DEBIT CARD\"\nAvailable funds: $balance")
    }
}