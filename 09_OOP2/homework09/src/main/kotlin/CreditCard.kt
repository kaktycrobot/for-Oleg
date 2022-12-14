open class CreditCard(balance: Int) : BankCard(balance) {
    open val creditLimit = 10000
    var ownFunds = 0
    var generalFunds = balance + ownFunds

    override fun topUpTheCard() {
        println("How much do you want to deposit?")
        val replenishmentAmount = readLine()?.toIntOrNull() ?: 0
        if (balance >= creditLimit) ownFunds += replenishmentAmount
        else {
            ownFunds = ownFunds + balance + replenishmentAmount - creditLimit
            balance = creditLimit
        }
        generalFunds = balance + ownFunds
    }

    override fun pay() {
        println("Payment amount:")
        val paymentAmount = readLine()?.toIntOrNull() ?: 0
        if (paymentAmount > generalFunds) println("Insufficient funds")
        else if (paymentAmount >= ownFunds) {
            balance += (ownFunds - paymentAmount)
            ownFunds = 0
        } else ownFunds -= paymentAmount
        generalFunds = balance + ownFunds
    }

    override fun getBalanceInfo() {
        println("\"CREDIT CARD\" balance: $balance")
    }

    override fun getAvailableFundsInfo() {
        println("\"CREDIT CARD\"\nAvailable funds: $generalFunds \nCredit funds: $balance \nOwn funds $ownFunds")
    }
}