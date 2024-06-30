fun main() {
    val str1: String? = "hello"
    val str2: String? = null

    printUppercaseOrMessage(str1) 
    printUppercaseOrMessage(str2) 
}
fun printUppercaseOrMessage(str: String?) {
    str?.let {
        println(it.toUpperCase())
    } ?: println("String is null")
}
