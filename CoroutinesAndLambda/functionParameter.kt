fun transformStrings(strings: List<String>, transformation: (String) -> String): List<String> {
    return strings.map { transformation(it) }
}

fun main() {
    val names = listOf("Alice", "Bob", "Charlie", "David")

    
    val uppercaseTransformation: (String) -> String = { it.toUpperCase() }

    val transformedNames = transformStrings(names, uppercaseTransformation)
    println("Transformed names: $transformedNames")
}
