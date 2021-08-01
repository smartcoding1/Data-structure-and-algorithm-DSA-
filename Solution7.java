class Solution7 {
    public int[] decompressRLElist(int[] nums) 
    {
         int n=nums.length;
         ArrayList<Integer> arr= new ArrayList<>();
        int freq=0;
        int value=0;
        for(int i=0;i<n/2;i++)
        {
            freq=nums[2*i];
            value=nums[2*i+1];
            while(freq>=1)
            {   arr.add(value);
                freq--;
            }
        }
        int[] primitive = arr.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return primitive;
    }
}
