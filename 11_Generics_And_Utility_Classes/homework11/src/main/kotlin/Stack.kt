class Stack<T> {
    private val stack: MutableList<T> = mutableListOf()
    fun push(item: T) = stack.add(item)
    fun pop(): T? {
        if (stack.size > 0) return stack.removeLast()
        return null
    }
    fun isEmpty() = stack.isEmpty()
}