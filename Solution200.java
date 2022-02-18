class Solution {
    public int[] sortedSquares(int[] nums)
    {
      int[] ans= new int[nums.length];
        int p1=0;
        int p2=nums.length-1;
        int idx=p2;
        while(p1<=p2){        
            if(Math.abs(nums[p1])>Math.abs(nums[p2]))
            {
                ans[idx--]=nums[p1]*nums[p1];
                p1++;
            }
            else
            {
                ans[idx--]=nums[p2]*nums[p2];
                p2--;
            }
        }
        return ans;
    }
}
