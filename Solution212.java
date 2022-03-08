class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
       ArrayList<Integer> list1= new ArrayList<>();
       ArrayList<Integer> list2= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                list1.add(nums[i]);
            else
                list2.add(nums[i]);
        }
        int[] ans= new int[nums.length];
        int count1=0,count2=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            ans[i]=list1.get(count1++);
            ans[i+1]=list2.get(count2++);
        }
        return ans;
    }
}
