class Solution {
    public int hammingDistance(int x, int y) 
    {  
       int count=0;
       int ans =x^y;
        while(ans!=0)
        {
            int rsb=ans & -ans;
            ans-=rsb;
            count++;
        }
        return count;
    }
}
