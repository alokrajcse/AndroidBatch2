fun main() {
    
    
  val s ="aabbaa"
    if(isplindrome(s)==true)
    {
        println("Palindrome")
    }
    else
    {
        println("Not Palindrome")
    }
    
}

fun isplindrome(s: String): Boolean
{
    var c=s.length-1;
    var s2=""
    for(i in 0..s.length-1)
    {
        s2=s2+s[c]
        c--
    }
    if(s2 == s)
    {
        return true
    }
    else
    {
        return false
    }
}