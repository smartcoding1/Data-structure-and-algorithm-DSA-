class Solution3{
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        int maj;
        
        Arrays.sort(nums);
        maj=nums[n/2];
            
            return maj;
        }
    }
