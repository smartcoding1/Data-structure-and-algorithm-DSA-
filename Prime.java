import java.util.*;
public class Solution {
  
    public boolean countPrimes(int n) 
    {
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
              return false;
             
              else 
              
              return true;
            
        }
         return true; 
    }
  public static void main(String...a)
  {   
      Solution b=new Solution();
     
      
      System.out.println( b.countPrimes(11));
  }
  
    
}
