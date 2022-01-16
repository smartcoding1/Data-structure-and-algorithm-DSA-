class Solution {
    public boolean isPowerOfFour(int n) 
    {   
        if(n<=0) return false;
        if(n-(n&-n)==0 && (n-1)%3==0)
        {
          return true;
        }
        return false;
    }
}
