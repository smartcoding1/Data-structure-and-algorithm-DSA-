class Solution {
    public int findMiddleIndex(int[] nums) 
    {   
        int n=nums.length;
         int[] arr1=new int[n];
         int[] arr2= new int[n];
         int pre=0,post=0;
     for(int i=0;i<n;i++)
     {
         pre=pre+nums[i];
         arr1[i]=pre;
     }
        
     for(int j=n-1;j>=0;j--)
     {
         post=post+nums[j];
         arr2[j]=post;
     }
     for(int k=0;k<n;k++)
     {
         if(arr1[k]==arr2[k])
             return k;
     }
        return -1;
    }
}
