class Solution {
    public boolean uniqueOccurrences(int[] arr)
    {
    HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr)
        map.put(ele,map.getOrDefault(ele,0)+1);
        for(int ele:map.keySet()){
            if(set.contains(map.get(ele)))
                return false;
           else
               set.add(map.get(ele));
        }
        return true;    
    }
}
