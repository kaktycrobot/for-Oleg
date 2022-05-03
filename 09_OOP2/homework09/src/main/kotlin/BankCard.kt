abstract class BankCard (var balance: Int) {
    abstract fun topUpTheCard()
    abstract fun pay()
    abstract fun getBalanceInfo()
    abstract fun getAvailableFundsInfo()

}