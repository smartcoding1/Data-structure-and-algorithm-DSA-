class Solution {
    public int search(int[] nums, int target) 
    {
        int st=0;
        int en=nums.length-1;
        while(st<=en)
        {
            int mid=(st+en)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
            {
               st=st+1; 
            }
            else
                en=en-1;
        }
        
        return -1;
    }
}
