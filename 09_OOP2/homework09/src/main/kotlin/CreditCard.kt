class CreditCard : BankCard(10000) {
    private val creditLimit = 10000
    var ownFunds = 0
    var generalFunds = balance + ownFunds

    override fun topUpTheCard() {
        println("How much do you want to deposit?")
        val replenishmentAmount = readLine()?.toIntOrNull() ?: 0
        if (balance >= creditLimit) ownFunds += replenishmentAmount
        else {
            ownFunds = balance + replenishmentAmount - creditLimit
            balance = creditLimit
        }
    }

    override fun pay() {
        println("Payment amount:")
        val paymentAmount = readLine()?.toIntOrNull() ?: 0
        if (paymentAmount > generalFunds) println("Insufficient funds")
        else if (paymentAmount >= ownFunds) {
            balance += (ownFunds - paymentAmount)
            ownFunds = 0
        }
        else ownFunds -= paymentAmount
    }


    override fun getBalanceInfo() {
        println("Balance: $balance")
    }

    override fun getAvailableFundsInfo() {
        println("Available funds: $generalFunds \nCredit funds: $balance \nOwn funds $ownFunds")
    }
}