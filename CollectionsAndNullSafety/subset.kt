fun main() {
    val list1 = listOf(1, 2, 3,5)
    val list2 = listOf(1, 2, 3, 4, 5)
    println(isSubset(list1, list2))  
}
fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
   
    
    val set2 = list2.toSet()  
    
    for (item in list1) {
        if (item !in set2) {
            return false
        }
    }
    
    return true
}


