class Rotate {
    public static void reverse(int nums[],int i,int n)
    {
        while(i<n)
        {
            int temp=nums[i];
            nums[i++]=nums[n];
            nums[n--]=temp;
        }
    }
    public void rotate(int[] nums, int k)
    {    
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    
}
