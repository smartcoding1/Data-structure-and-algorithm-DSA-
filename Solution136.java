class Solution {
    public int[] findErrorNums(int[] nums) 
    {   
        int [] arr= new int[2];
       int xor=0;
       for(int i=0;i<nums.length;i++)
        {
           xor^=nums[i];
        }
        for(int i=1;i<=nums.length;i++)
        {
            xor^=i;
        }
        int rsb= xor & -xor;
        int x=0,y=0;
        for(int val:nums)
        {
            if((val & rsb)==0)
                x^=val;
            else
            {
                y^=val;
            }
        }
        for(int i=1;i<=nums.length;i++)
        {
            if((i&rsb)==0)
                x^=i;
            else
                y^=i;
        }
        for(int val:nums)
        {
            if(val==x)
            {
                arr[0]=x;
                arr[1]=y;
            }
            else if(val==y)
            {
                arr[0]=y;
                arr[1]=x;
            }
        }
        return arr;
    }
        
}
