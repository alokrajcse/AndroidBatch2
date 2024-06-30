fun filterNonNullNumbers(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}

fun main() {
    val numbers = listOf(1, null, 3, null, 5, 6, null, 8)
    val nonNullNumbers = filterNonNullNumbers(numbers)

    println("Non-null numbers: $nonNullNumbers")
}
