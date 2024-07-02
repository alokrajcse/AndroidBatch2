fun accessArrayElement(array: Array<Int>, index: Int)  {
     try {
        println("element at index $index is "+array[index])
        
    } 
    catch (e: Exception) {
        println("Error: Index $index is out of bounds")
    
    } finally {
        println("End of operation")
    }
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    
    
    
    
    accessArrayElement(array,3)
    accessArrayElement(array,9)
    
}
