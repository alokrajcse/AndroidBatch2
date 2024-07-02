fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

   
    val squaredNumbers = numbers.map { it * it }

   
    val oddSquaredNumbers = squaredNumbers.filter { it % 2 != 0 }

   
    val sum = oddSquaredNumbers.reduce { s, it -> s + it }

    println("Original numbers: $numbers")
    println("Squared numbers: $squaredNumbers")
    println("Odd squared numbers: $oddSquaredNumbers")
    println("Sum of odd squared numbers: $sum")
}