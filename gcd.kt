fun main() {
    
   
    var a= 10
    var b=15
    var x=a
    var y=b
    while (y!=0)
    {
        var temp =y
        y=x%y
        x=temp
        
    }
    
    var gcd=x
    println("gcd is: "+ x)
    
}
