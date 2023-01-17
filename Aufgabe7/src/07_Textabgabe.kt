fun main() {
    var sports: List<String> = listOf("Football", "Handball", "Basketball") // Diese Zeile darf nicht verändert werden!

    // todo: Passe den Code ab hier an.
    var sport: String = sports[sports.size - 2]
    println(sport)

    // Dies ist nur meine erstellte Rechnung zu üben für mich
    var ballAmount: List<Int> = listOf (3, 6, 9)
    var ballAmountFootball: Int = ballAmount[0]
    var ballAmountHandball: Int = ballAmount[1]
    var ballAmountBasketball: Int = ballAmount[ballAmount.size -1]

    var ballSummary: Int = ballAmountFootball + ballAmountHandball + ballAmountBasketball
    var ballSummary2: Int = ballSummary / ballAmountHandball
    var ballSummary3: Double = ballSummary2.toDouble()
    //var ballSummary4: Double = [0, 1, 2].toDouble()
    // println(ballSummary2.toDouble())
    //println(ballSummary3)
    //println(ballSummary4)
    println(ballAmount)
}