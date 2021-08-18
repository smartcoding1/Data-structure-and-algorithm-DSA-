class Solution13 {
    public void sortColors(int[] nums)
    {  
        int p1=0;
        int p2=0;
        int p3=nums.length-1;
        while(p2<=p3)
        {
            if(nums[p2]==2)
            {
                nums[p2]+=nums[p3]-(nums[p3]=nums[p2]);
                p3--;
            }
            else if(nums[p2]==0)
            {
                nums[p2]+=nums[p1]-(nums[p1]=nums[p2]);
                p1++;
                p2++;
            }
            else
            {
                p2++;
            }
        }
    }
}
