fun main() {
    
    
  val num = larger(5,6)
  println(num)
 
    
}

fun larger(a: Int, b: Int): Int
{
    if(a>b)
    {
        return a
    }
    else
    {
        return b
    }
}