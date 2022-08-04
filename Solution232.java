class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
       HashMap<HashMap<Character,Integer>,ArrayList<String>> mainMap= new HashMap<>();
       
        for(String ele:strs)
        {   
            HashMap<Character,Integer> map= new HashMap();
            char[] arr=ele.toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);      
            }
            if(!mainMap.containsKey(map)){
                 ArrayList<String> list= new ArrayList<>();
                 list.add(ele);
                 mainMap.put(map,list);
            }
            else
            {
                ArrayList<String> list=mainMap.get(map);
                list.add(ele);
                mainMap.put(map,list);
            }
            
        }
        System.out.println(mainMap);
      //  System.out.println(mainMap.keySet());
        List<List<String>> mainList= new ArrayList<>();
        for(HashMap ele:mainMap.keySet())
        {
            ArrayList<String> list=mainMap.get(ele);
            mainList.add(list);
        }
        
        
        return mainList;
    }
}
