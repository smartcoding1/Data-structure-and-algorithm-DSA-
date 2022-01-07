class Solution {
    public int countPoints(String rings)
    { 
     int n=rings.length();   
     HashMap<Character,HashSet> map= new HashMap<>();
     char[] arr= rings.toCharArray();
        for(int i=1;i<n;i=i+2)
        {
            if(map.containsKey(arr[i]))
                map.get(arr[i]).add(arr[i-1]);
            else
            {
              HashSet<Character> set= new HashSet<>();
                set.add(arr[i-1]);
                map.put(arr[i],set);
            }
        }
        int count=0;
       for(Character key:map.keySet())
       {
           if(map.get(key).size()==3)
               count++;
       }
        return count;
    }
}
