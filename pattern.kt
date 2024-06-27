fun main() {
    val n = 5 

    
    for (i in 1..n) {
    
        for (j in i until n) {
            print(" ")
        }
        
        for (k in 1 until 2 * i) {
            print("*")
        }
        println()
    }

    
    for (i in n-1 downTo 1) {
        
        for (j in n downTo i+1) {
            print(" ")
        }
        
        for (k in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}
