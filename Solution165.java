class Solution {
    public boolean canConstruct(String ransomNote, String magazine)
    { 
        
        HashMap<Character,Integer> map= new HashMap<>();
        char[] arr= magazine.toCharArray();
        for(char ele:arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        char[] arr2=ransomNote.toCharArray();
        for(char ele:arr2)
        {
            if(map.containsKey(ele))
            {
                int tem=map.get(ele);
                if(tem!=0)
                {
                    tem--;
                    map.put(ele,tem);
                }
                else
                    return false;
            }
            else
                return false;
        }
        return true;
        
    }
}
