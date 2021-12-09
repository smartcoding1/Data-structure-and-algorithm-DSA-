class Solution {
    public List<Integer> minSubsequence(int[] nums)
    {  
       Arrays.sort(nums);
       List<Integer> list= new ArrayList<>();
       if(nums.length==1)
       {
           list.add(nums[0]);
           return list;
       }
       int[] prearr= new int[nums.length];
        int presum=0;
        for(int i=0;i<nums.length;i++)
        {
           presum+=nums[i];
            prearr[i]=presum;
        }
        int n=nums.length-1;
        int ans=nums[n];
        list.add(nums[n]);
        while(ans<=prearr[n-1])
        {
            list.add(nums[n-1]);
            ans+=nums[n-1];
            n--;
            if(n==0)
                break;
        }
        return list;
    }
}
