class Solution {
    public int longestOnes(int[] nums, int k) 
    {
       int i=0,j=0;
       int flip=0,count=0;
        for(j=0;j<nums.length;j++)
        {   
           if(nums[j]==0)
               flip++;
            if(flip>k)
            {
                if(nums[i++]==0)
                    flip--;
            }
            if(j>=i)
                count=Math.max(count,j-i+1);
                
        }
        return count;
    }
}
