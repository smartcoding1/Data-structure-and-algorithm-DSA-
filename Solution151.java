class Solution {
    public String kthDistinct(String[] arr, int k) 
    {
      HashMap<String,Integer> map=new HashMap<>();
        for(String ele:arr)
            map.put(ele,map.getOrDefault(ele,0)+1);
        
        System.out.println(map);
        ArrayList<String> list= new ArrayList<>();
        for(String ele:map.keySet())
        {
            if(map.get(ele)==1)
                list.add(ele);
        }
        int num=0;
        for(String ele:arr)
        {
            if(list.contains(ele))
                num++;
                if(num==k)
                return ele;
                    
            
        }
        return"";
        
    }
}
