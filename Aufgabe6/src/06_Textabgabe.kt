fun main() {
    val programmingLanguages: List<String> = listOf("Java", "Python", "ABAP", "JavaScript", "Kotlin", "Swift", "C#")
    // todo: Weise der Konstante index den korrekten Wert zu,
    //  sodass in der Liste der String "Kotlin" ausgewählt und in der Konsole ausgegeben wird.
    val index: Int = 4
    val myProgrammingLanguage: String = programmingLanguages[index]
    println(myProgrammingLanguage)

    val programmingLanguages2: List<String> = listOf("Java", "Python", "ABAP", "JavaScript", "Kotlin", "Swift", "C#")
    val myProgrammingLanguage2: String = programmingLanguages [4]
    println(myProgrammingLanguage2)
}