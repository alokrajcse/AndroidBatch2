fun factorial(n: Int): Int {
    
    if(n<=1)
    {
        return 1
    }
    else
    {
        return n*factorial(n-1)
    }
    
    
}

fun main() {
    val number = 8
    println("Factorial is " +factorial(number))
}
