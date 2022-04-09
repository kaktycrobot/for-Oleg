fun main() {
    println("How many phone numbers do you want to add?")
    var inputNumber: Int = readLine()?.toIntOrNull() ?: 0
    while (inputNumber <= 0) {
        println("Number must be positive\nEnter number again")
        inputNumber = readLine()?.toIntOrNull() ?: 0
    }
    val phoneBook = addPhoneBookNumber(inputNumber)
    println("Entered numbers:")
    phoneBook.forEach { item -> println(item) }
    println("Numbers beginning with +7: " + phoneBook.filter { it.startsWith("+7")})
/*    val phoneBookSet = phoneBook.toSet()
    println(phoneBookSet.size)*/
    println("Unique numbers: " + phoneBook.toSet().size)
    println("Total characters in all numbers: " + phoneBook.sumOf { it.length  })
    val phoneBookMap = mutableMapOf<String, String>()
    phoneBook.forEach {
        println("Enter name for number $it:")
        var name = readLine().toString()
        phoneBookMap[it] = name
    }
    phoneBookMap.forEach { (key, value) ->
        println("Subscriber: $value. Phone number: $key.")
    }
//    println("Sort by phone number: " + phoneBookMap.toSortedMap())
    println("Sort by phone number: ")
    for (entry in phoneBookMap.entries.sortedBy{it.key})
        println ("${entry.key} - ${entry.value}")
    println("Sort by name: ")
    for (entry in phoneBookMap.entries.sortedBy{it.value})
        println ("${entry.value} - ${entry.key}")
}

fun addPhoneBookNumber(inputNumber: Int): List<String> {
    val phoneBook = mutableListOf<String>()
    for (i in 0 until inputNumber) {
        println("Enter phone number:")
        val number = readLine().toString()
        phoneBook.add(number)
    }
    return phoneBook
}