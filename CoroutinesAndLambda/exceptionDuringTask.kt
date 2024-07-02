import kotlinx.coroutines.*

fun main() = runBlocking {
launch {
        try {
            println("Starting task")
            divideByZeroTask()
            println("Task completed successfully")
        } catch (e: ArithmeticException) {
            println("Caught exception: ${e.message}")
        }
    }
    
    println("Main program continue")
}

suspend fun divideByZeroTask() {
    delay(1000L) 
    val result = 10 / 0 
    println("Result: $result")
}
