fun main() {
    var r1=rectangle(2.1,3.1)
    
    println("area of rectangle: "+ r1.area())
    println("perimeter of rectangle: "+r1.perimeter())
    
    var c1=circle(5.2)
    println("area of circle: "+ c1.area())
    println("perimeter of circle: "+c1.perimeter())
    
}

abstract class Shape{
    abstract fun area(): Double
    
    
}

class rectangle(var l: Double, var b: Double): Shape(){
    
    
    override fun area(): Double {
        return l*b
    }
    fun perimeter(): Double{
        return 2*(l+b)
    }
}

class circle(var r: Double): Shape(){
    
    override fun area(): Double {
        return 3.14*r*r
    }
    fun perimeter(): Double{
        return 2*3.14*r
    }
}

