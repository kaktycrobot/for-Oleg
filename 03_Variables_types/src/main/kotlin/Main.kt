fun main() {
    val firstName: String = "Sergei"
    val lastName: String = "Ivanov"
    var height: Double = 1.86
    var weight: Float = 87f
    var ageVerification: Boolean = height < 1.50 && weight < 40f
    var isChild = if (ageVerification == true) {
        "a child"
    } else {
        "not a child"
    }
    var info: String = "About me:\nMy Name is $firstName $lastName\nMy height is $height meters\nMy weight is $weight kilograms\nI'm $isChild"
    println(info)
    println("""******************************
        (if i'm short)
    """.trimIndent())
    height = 0.9
    ageVerification = height < 1.50 && weight < 40f
    isChild = if (ageVerification == true) {
        "a child"
    } else {
        "not a child"
    }
    info = "About me:\nMy Name is $firstName $lastName\nMy height is $height meters\nMy weight is $weight kilograms\nI'm $isChild"
    println(info)
    println("""******************************
        (if i'm dystrophic)
    """.trimIndent())
    height = 1.75
    weight = 35f
    ageVerification = height < 1.50 && weight < 40f
    isChild = if (ageVerification == true) {
        "a child"
    } else {
        "not a child"
    }
    info = "About me:\nMy Name is $firstName $lastName\nMy height is $height meters\nMy weight is $weight kilograms\nI'm $isChild"
    println(info)
    println("""******************************
        (if I'm really a child)
    """.trimIndent())
    height = 0.8
    weight = 25f
    ageVerification = height < 1.50 && weight < 40
    isChild = if (ageVerification == true) {
        "a child"
    } else {
        "not a child"
    }
    info = "About me:\nMy Name is $firstName $lastName\nMy height is $height meters\nMy weight is $weight kilograms\nI'm $isChild"
    println(info)
}