fun main() {
    val number = 5
    val factorialLambda: (Int) -> Int = { n ->
        var result: Int = 1
        for (i in 2..n) {
            result *= i
        }
         result
    }

    val factorial = calculateFactorial(number, factorialLambda)
    println("Factorial of $number is: $factorial")
}

fun calculateFactorial(n: Int, factorialFunction: (Int) -> Int): Int {
    return factorialFunction(n)
}
