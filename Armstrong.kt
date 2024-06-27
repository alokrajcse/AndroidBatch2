fun main() {
    
    val a= 153
    var temp =a
    
    var s=0;
    
    while(temp!=0)
    {
        var r=temp%10
        r=r*r*r
        s=s+r
        temp=temp/10
        
    }
    
    if(s==a)
    {
        println("Armstrong")
    }
    else
    {
        println("No Armstromg")
    }
    
    
    
}
