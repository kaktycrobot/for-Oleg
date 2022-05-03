fun main() {
    val debitCard = DebitCard()
    val creditCard = CreditCard()

    debitCard.pay()
    debitCard.topUpTheCard()
    debitCard.getBalanceInfo()
    debitCard.pay()
    debitCard.getAvailableFundsInfo()
    creditCard.getBalanceInfo()
    creditCard.getAvailableFundsInfo()
    creditCard.topUpTheCard()
    creditCard.pay()
    creditCard.getBalanceInfo()
    creditCard.getAvailableFundsInfo()
    creditCard.pay()
    creditCard.topUpTheCard()
    creditCard.getBalanceInfo()
    creditCard.getAvailableFundsInfo()

}