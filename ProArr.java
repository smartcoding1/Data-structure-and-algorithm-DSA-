class ProArr {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int [n];
        int ans[]=new int [n];
        int p_pro=1,p_pro2=1;
        for(int i=1;i<n;i++)
        {
          p_pro*=nums[i-1];
            arr1[i]=p_pro;
        }
        for(int i=n-1;i>0;i--)
        {
          p_pro2*=nums[i];
            arr2[i-1]=p_pro2;
        }
        ans[0]=arr2[0];
        ans[n-1]=arr1[n-1];
        for(int i=1;i<n-1;i++)
        {
            ans[i]=arr1[i]*arr2[i];
        }
        return ans;
    }
}
