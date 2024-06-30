fun filterStrings(list: List<Any>): List<String> {
    val stringList = mutableListOf<String>()

    for (item in list) {
        if (item is String) {
            stringList.add(item)
        }
    }

    return stringList
}

fun main() {
    val mixedList: List<Any> = listOf("hello", 123, "world", 456, "abc123")
    val stringsOnly = filterStrings(mixedList)

    println("Filtered Strings: $stringsOnly")
}
