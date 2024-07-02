import kotlinx.coroutines.*
fun main() = runBlocking {

    println("Hello")
    launch{
        delay(1000L)
        println("world")
        
    }
    println("program completed")
}