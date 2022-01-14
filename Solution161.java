class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit)
    {
      int[] prexor= new int[nums.length];
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
            prexor[i]=xor;
        }
        int max=(int)Math.pow(2,maximumBit)-1;
        //System.out.print(n);
        int tem=0,k=0;
        for(int i=prexor.length-1;i>=0;i--)
        {
            k=prexor[i]^max;
            nums[tem++]=k;
        }
        return nums;
    }
}
