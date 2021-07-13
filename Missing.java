class Missing {
    public int missingNumber(int[] nums)
    {
        int n =nums.length;
        int x1=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            x1=x1^nums[i];
        }
        int x2=0;
        for(int i=1; i<=n; i++)
        {
            x2=x2^i;
        }
       return x1^x2; 
    }
}
