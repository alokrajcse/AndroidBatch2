
fun main() {
    
    val age =15
    try{
        
        if(age<18)
        {
            throw MyException("Underage")
        }
        else
        {
        println("Valid age")
        }
    }
    catch(e: Exception)
    {
        println("Exception : $e")
    }
}

class MyException(message: String) : Exception(message)
{
    
}
