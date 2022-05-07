class CreditCardCashback : CreditCard(5000) {
    override val creditLimit = 5000
    private val potentialCashback = (1..5).random() * 0.01
    private var totalCashback = 0

    override fun pay() {
        println("Payment amount:")
        var cashback = 0
        val paymentAmount = readLine()?.toIntOrNull() ?: 0
        if (paymentAmount > generalFunds) println("Insufficient funds")
        else if (paymentAmount >= ownFunds) {
            balance += (ownFunds - paymentAmount)
            ownFunds = 0
        } else ownFunds -= paymentAmount
        if (paymentAmount >= 5000) {
            cashback += (paymentAmount * potentialCashback).toInt()
            ownFunds += cashback
            println("Your cashback is $cashback")
        }
        totalCashback += cashback
        generalFunds = balance + ownFunds
    }

    override fun getAvailableFundsInfo() {
        println("\"CASHBACK CREDIT CARD\"\nAvailable funds: $generalFunds \nCredit funds: $balance \nOwn funds $ownFunds\nYour total cashback is: $totalCashback")
    }
}