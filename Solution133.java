public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {
       int count=0;
       int rsb=0;
       while(n!=0)
       {
           rsb= n & -n;
           n-=rsb;
           count++;
       }
        return count;
    }
}
