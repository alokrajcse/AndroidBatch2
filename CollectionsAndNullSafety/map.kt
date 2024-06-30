fun main() {
    val s=map(listOf("ab","abc","abcd"))
    println(s)
}

fun map(numList: List<String>): MutableMap<String,Int> {
    
    var map2=mutableMapOf<String,Int>()

    
    for (i in numList) {
        
        map2.put(i,i.length)

    }
    return map2
}
