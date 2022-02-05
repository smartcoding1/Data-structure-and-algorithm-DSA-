class Solution {
    public String[] uncommonFromSentences(String s1, String s2)
    {
       ArrayList<String> list= new ArrayList<>();
       String[] arr1=s1.split(" ");
       String[] arr2=s2.split(" ");
       HashMap<String,Integer> map=new HashMap<>();
         for(String ele:arr1)
            map.put(ele,map.getOrDefault(ele,0)+1);
         for(String ele:arr2)
            map.put(ele,map.getOrDefault(ele,0)+1);
        for(String ele:map.keySet())
        {
            if(map.get(ele)==1)
                list.add(ele);
        }
        String[] ans= new String[list.size()];
        int i=0;
        for(String ele:list)
            ans[i++]=ele;
        
        return ans;
 
    }
}
