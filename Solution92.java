class Solution {
    public int minStartValue(int[] nums) 
    {
      int[] arr= new int[nums.length];
        int pre=0;
        for(int i=0;i<nums.length;i++)
        {
            pre=pre+nums[i];
            arr[i]=pre;
        }
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]+count<1)
            {
                count++;
                i--;
            }
        }
        return count;
    }
}
