fun main() {
    
  
    var s="12001"
    var duck=false
    
    
    for(i in 1..s.length-1)
    {
     
        if(s[i]=='0')
        {
            duck=true
        }
        
        
    }
    if(duck==true)
    {
        println("Duck number")
    }
    else
    {
        println("Not duck number")
    }
    
}
