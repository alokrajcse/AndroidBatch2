fun main() {
    val a = nullstr("hello")
    println(a)
}

fun nullstr(s: String?): Int {
    return if (s != null) {
        s.length
    } else {
        -1
    }
}
