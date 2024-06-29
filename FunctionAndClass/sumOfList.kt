fun main() {
    
    
  val num = sumOfList(1,2,3,4,5,6,7,8,9)
  println(num)
 
    
}

fun sumOfList(vararg numbers: Int): Int
{
    var sum=0;
    for(num in numbers)
    {
        sum=sum+num
    }
    return sum
}