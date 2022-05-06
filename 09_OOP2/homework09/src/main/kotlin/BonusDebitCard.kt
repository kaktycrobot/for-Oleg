class BonusDebitCard : DebitCard(0) {
    private var bonus: Int = 0
    override fun pay() {
        println("Payment amount:")
        val paymentAmount = readLine()?.toIntOrNull() ?: 0
        if (paymentAmount > balance) println("Insufficient funds")
        else
            if (bonus > 0) {
                println("You have ${bonus} bonus point\nDo you want to use bonus points?\n1. Yes\n2. No")
                when (readLine()?.toIntOrNull() ?: 0) {
                    1 -> if (bonus >= paymentAmount) bonus -= paymentAmount
                    else {
                        balance += (bonus.toInt() - paymentAmount)
                        bonus = 0
                    }
                    2 -> {
                        balance -= paymentAmount
                        bonus += (paymentAmount * 0.01).toInt()
                    }
                }
            } else {
                balance -= paymentAmount
                bonus += (paymentAmount * 0.01).toInt()
            }


    }

    override fun getAvailableFundsInfo() {
        println("Available debit card funds: $balance\nBonus points: ${bonus}")
    }
}