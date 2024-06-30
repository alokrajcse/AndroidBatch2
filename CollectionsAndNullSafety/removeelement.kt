fun main() {
    rev(listOf(5, 2, 3, 4, 5, 6),2)
}

fun rev(numList: List<Int>, a: Int) {
    val numList2 = mutableListOf<Int>()
    
    for (i in numList) {
        if(i!=a)
        {
        
            numList2.add(i)
        }
        
        
    }
    println(numList2)
}
