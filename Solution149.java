class Solution {
    public int repeatedNTimes(int[] nums) 
    {
      HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);}
                    System.out.println(map);     
         int n=nums.length/2;
          for(int ele:map.keySet()){
              if(map.get(ele)==n)
                  return ele;}
        return 0;
    }
}
