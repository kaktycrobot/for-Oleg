fun main() {

    println("Enter number")
    var inputNumber: Int = readLine()?.toIntOrNull() ?: return
    while (inputNumber <= 0) {
        println("Number must be greater than zero\nEnter number again")
        inputNumber = readLine()?.toIntOrNull() ?: return
    }
        println("for $inputNumber, the Fibonacci number is " + sumFibonacci(inputNumber))
}

fun sumFibonacci(inputNumber: Int): Long {
    var varOne: Long = 0
    var varTwo: Long = 1
    var sum: Long = 0
    if (inputNumber == 1) return 0
    if (inputNumber == 2) return 1
    else
    for (count in 3..inputNumber) {
        sum = varOne + varTwo
        varOne = varTwo
        varTwo = sum
    }

    return sum
}
