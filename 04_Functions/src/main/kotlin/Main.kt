fun main() {
    val result: String = "F2p)v\"y233{0->c}ttelciFc"
    val firstPart = result.substring(0, result.length / 2)
    val secondPart = result.substring(startIndex = result.length / 2)
    println(decryptionOne(firstPart)+"\n"+decryptionTwo(secondPart))
}
fun decryptionOne(firstPart: String) : String {
//    var shiftSource: String = firstPart
    val operationOne = shift(1, firstPart)
    val operationTwo = operationOne.replace('5','s')
    val operationThree = operationTwo.replace('4', 'u')
    val operationFour = shift(-3, operationThree)
    val operationFive = operationFour.replace('0', 'o')
    return operationFive
}
fun decryptionTwo(secondPart: String) : String {
//    var shiftSource: String = secondPart
    val operationOne = secondPart.reversed()
    val operationTwo = shift(-4, operationOne)
    val operationThree = operationTwo.replace('_', ' ')
    return operationThree
}

fun shift(x: Int, shiftSource: String) : String {
    val shiftedString = shiftSource.map {char -> char + x}.joinToString("")
    return shiftedString
}