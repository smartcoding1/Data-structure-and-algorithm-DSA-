class Solution {
    public int findGCD(int[] nums) 
    {
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int rem=-1;
        while(rem!=0)
        {
            rem=max%min;
            if(rem==0)
                return min;
            if(rem==1)
                return 1;
            else
            {
                max=min;
                min=rem;
            }
        }
        return 0;
    }
}
