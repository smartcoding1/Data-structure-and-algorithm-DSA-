class Solution {
    public int[] sortArrayByParity(int[] nums)
    {   
        int p1=0;
        int p2=nums.length-1;
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                ans[p1]=nums[i];
                 p1++;
                }
            else{
                ans[p2]=nums[i];
                p2--;
            }
        }
        return ans;
    }
}
