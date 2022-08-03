class Solution {
    public int numOfPairs(String[] nums, String target)
    {  
       int count=0;
       for(int i=0;i<nums.length-1;i++)
       {
           for(int j=i+1;j<nums.length;j++)
           {
               String tem=nums[i]+nums[j];
               if(tem.equals(target))
               {
                   count++;    
               } 
               String tem2=nums[j]+nums[i];
                   if(tem2.equals(target))
                       count++;
           }
       }
        return count;
    }
}
