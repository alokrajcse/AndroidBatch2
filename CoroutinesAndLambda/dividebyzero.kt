fun divideNumbers(num1: Int, num2: Int): String {
     try {
        val result = num1 / num2
       return "Result: $result"
    } catch (e: ArithmeticException) {
        return "Error: Division by zero is not allowed"
    }
}

fun main() {
    val num1 = 10
    val num2 = 0
    println(divideNumbers(num1, num2))
    
    val num3 = 10
    val num4 = 2
    println(divideNumbers(num3, num4))
}
