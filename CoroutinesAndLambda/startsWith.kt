fun processStrings(strings: List<String>, startsWith: Char): List<String> {
    return strings
        .filter { it.startsWith(startsWith, ignoreCase = true) } 
        .map { it.toUpperCase() } 
        .sorted() 
}

fun main() {
    val names = listOf("Alok", "Bikas", "Chandu", "Dev")

    val startsWithLetter = 'a'
    val processedStrings = processStrings(names, startsWithLetter)
    
    println("Filtered, converted to uppercase, and sorted strings starting with '$startsWithLetter':")
    println(processedStrings)
}

