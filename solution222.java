class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int i=0,j=0;
        HashSet<Integer> set= new HashSet<>();
        while(j<nums.length)
        {
            if(set.contains(nums[j]))
                return true;
            else if(j-i<k)
            {
                set.add(nums[j]);
                j++;
            }
            else if(j-i==k)
            {   
                set.add(nums[j]);
                set.remove(nums[i]);
                i++;
                j++;
            }
                
        } 
        return false;
    }
}
