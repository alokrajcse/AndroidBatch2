fun main() {
    
  
    val s="android"
    var freq_a=0
    var freq_n=0
    var freq_d=0
    var freq_r=0
    var freq_o=0
    var freq_i=0
    
    for(i in 0..s.length-1)
    {
        if(s[i]=='a')
        {
            freq_a++
        }
        if(s[i]=='n')
        {
            freq_n++
        }
        
        if(s[i]=='d')
        {
            freq_d++
        }
        if(s[i]=='r')
        {
            freq_r++
        }
        
        
        if(s[i]=='o')
        {
            freq_o++
        }
        if(s[i]=='i')
        {
            freq_i++
        }
        
      
        
    }
    
      println("Frequency of a = "+freq_a)
        println("Frequency of n = "+freq_n)
        println("Frequency of d = "+freq_d)
        println("Frequency of r = "+freq_r)
        println("Frequency of o = "+freq_o)
        println("Frequency of i = "+freq_i)
        
    
    
    
    
    
}
