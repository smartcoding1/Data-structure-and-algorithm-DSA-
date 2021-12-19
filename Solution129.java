class Solution {
    public int countPrimeSetBits(int left, int right) 
    { 
      int num=0;  
      while(left<=right)
      {   
          int count=0;
          int tem=left;
          while(tem!=0)
          {    
          int rsb=tem & -tem;
          tem-=rsb;
          count++;    
          }
          System.out.print(count);
          left++;
          if(isprime(count))
              num++;
      }
        return num;
    }
    boolean isprime(int num)
    {
        if(num==1)
            return false;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
