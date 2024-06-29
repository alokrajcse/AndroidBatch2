fun main() {
    val square = Square(4.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    square.drawInfo()
    triangle.drawInfo()
}

interface Drawable {
    fun drawInfo()
}

class Square(val side: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side length: $side")
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }

    private fun area(): Double {
        return side * side
    }

    private fun perimeter(): Double {
        return 4 * side
    }
}

class Triangle(val a: Double, val b: Double, val c: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with sides: $a, $b, $c")
        println("Area: ${area()}")
        println("Perimeter: ${perimeter()}")
    }

    private fun area(): Double {
        val s = (a + b + c) / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    private fun perimeter(): Double {
        return a + b + c
    }
}
