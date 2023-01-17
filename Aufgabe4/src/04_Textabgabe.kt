fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val number1: Int = numbers[numbers.size - 2] + 5
    val number2: Int = numbers[numbers.size - 3]
    /*9
      3
     */
    println(number1)
    println(number2)
}