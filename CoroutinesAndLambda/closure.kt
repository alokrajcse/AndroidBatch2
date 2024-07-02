fun adderClosure(numberToAdd: Int): (Int) -> Int {
    return { input: Int -> input + numberToAdd }
}

fun main() {
    val addFive = adderClosure(5)

    println("Adding 5 to 10: ${addFive(10)}") 
    println("Adding 5 to 0: ${addFive(0)}")   
}
