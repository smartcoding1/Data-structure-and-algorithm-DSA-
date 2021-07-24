import java.util.*;
public class Solution {
   static  ArrayList<Integer> arr= new ArrayList<Integer>();
    public int countPrimes(int n) 
    {
    
        
        
        
       int count=0;
        boolean a[]=new  boolean[n];
        Arrays.fill(a,true);
        for(int i=2;i*i<=n;i++)
            if(a[i])
                for(int j=i*i;j<n;j+=i)
                    a[j]=false;
                    
       for(int i=2;i<a.length;i++)
       {
          if(a[i]==true)
               arr.add(i);
       }
        return arr.size();
    }
  public static void main(String...a)
  {   
      Solution b=new Solution();
      b.countPrimes(10);
      for(int x : arr)
      System.out.println(x);
  }
  
    
}
