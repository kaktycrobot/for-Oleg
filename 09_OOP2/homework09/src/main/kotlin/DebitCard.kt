open class DebitCard(balance: Int) : BankCard(0) {
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
        println("Debit card balance: $balance")
    }

    override fun getAvailableFundsInfo() {
        println("Available debit card funds: $balance")
    }
}