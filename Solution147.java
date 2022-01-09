class Solution {
    public String destCity(List<List<String>> paths)
    {
     HashMap<String,String> map=new HashMap<>();
        for(List list:paths)
            map.put((String)list.get(0),(String)list.get(1));
           String Cdes=paths.get(0).get(0);
           while(map.containsKey(Cdes))
           {
               Cdes=map.get(Cdes);
           }
        System.out.println(map);
        return Cdes;
    }
}
