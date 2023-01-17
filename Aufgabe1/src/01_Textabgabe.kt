fun main() {
    val fruits: List<String> = listOf("Banane", "Apfel", "Birne")
    val fruit: String = fruits[fruits.size-3]
    // Exception Index out of Bounds
    println(fruit)

    var userName: String? = null
    println("Gib hier deien Namen ein:")
    userName = readln()
    println("Hallo $userName")
}