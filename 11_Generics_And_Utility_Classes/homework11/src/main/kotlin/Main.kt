fun main() {
    val stackList = Stack<Int>()
    println("is stack empty:" + stackList.isEmpty())
    stackList.push(3)
    stackList.push(2)
    stackList.push(1)
    println("the pop elements is : " + stackList.pop())
    println("the pop elements is : " + stackList.pop())
    println("is stack empty:" + stackList.isEmpty())
    println("the pop elements is : " + stackList.pop())
    println("is stack empty:" + stackList.isEmpty())
}