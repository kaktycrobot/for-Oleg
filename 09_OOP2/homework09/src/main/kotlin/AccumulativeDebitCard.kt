import kotlin.math.roundToInt

class AccumulativeDebitCard : DebitCard(0) {
    var accumulativeFunds = 0
    override fun topUpTheCard() {
        println("If you deposit 100 or more, you will have an accumulation of 0.005% of the deposited amount\nHow much do you want to deposit?")
        val replenishmentAmount = readLine()?.toIntOrNull() ?: 0
        val accumulationValue = (replenishmentAmount * 0.005).roundToInt()
        balance += replenishmentAmount + accumulationValue
        accumulativeFunds += accumulationValue
    }

    override fun getBalanceInfo() {
        println("\"ACCUMULATIVE DEBIT CARD\" balance: $balance")
    }

    override fun getAvailableFundsInfo() {
        println("\"ACCUMULATIVE DEBIT CARD\"\nAvailable funds: $balance\nTotal accumulated funds: $accumulativeFunds")
    }
}