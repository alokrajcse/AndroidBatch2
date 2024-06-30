fun main() {
    rev(listOf(1, 2, 3, 4, 5, 6))
}

fun rev(numList: List<Int>) {
    val numList2 = mutableListOf<Int>()
    var c=numList.size-1
    for (i in numList) {
        numList2.add(numList[c])
        c--
    }
    println(numList2)
}
