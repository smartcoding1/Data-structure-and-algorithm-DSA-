class Solution {
    public List<Integer> findAnagrams(String s, String p)
    {  
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
        }
        //System.out.println(map1);
        int k=p.length();
        System.out.println(k);
        int i=0,j=0;
        char[] arr= s.toCharArray();
        while(j<arr.length)
        {
            if(j-i+1<k)
            {
                   map2.put(arr[j],map2.getOrDefault(arr[j],0)+1);
                j++;
            }
            else if(j-i+1==k)
            {    
                map2.put(arr[j],map2.getOrDefault(arr[j],0)+1); 
                System.out.println(map1);
                System.out.println(map2);
                if(map2.equals(map1)){
                    //System.out.print("sullo");
                    list.add(i);}
               /* if(j+1<arr.length){
                     map2.put(arr[j+1],map2.getOrDefault(arr[j+1],0)+1);
                }*/
                if(map2.get(arr[i])==1)
                    map2.remove(arr[i]);
                 else   
                    map2.put(arr[i],map2.get(arr[i])-1);
                i++;
                j++;
            }
        }
        
        return list;
    }
}
