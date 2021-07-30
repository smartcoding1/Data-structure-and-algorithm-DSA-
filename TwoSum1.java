class TwoSum1{
public int[] twoSum(int[] nums, int target) {
    /*for (int i = 0; i < nums.length; i++)
    {
        for (int j = i + 1; j < nums.length; j++) 
        {
            if (nums[j] == target - nums[i])
            {
                return new int[] { i, j };
            }
        }
        
    }*/
    
    int n=nums.length;
    Map <Integer,Integer> h= new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(h.containsKey(target-nums[i]))
            return new int[]{h.get(target-nums[i]), i};
        else
        {
            h.put(nums[i],i);
        }
        
    }
   
        
            return new int[]{0,0};
   
}
}
