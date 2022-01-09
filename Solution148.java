class Solution {
    public boolean areOccurrencesEqual(String s) 
    {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++)
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),1)+1);
         boolean flag=true;
         int value=map.get(s.charAt(0));
        for(Character ele:map.keySet())
        {   
           
            if(map.get(ele)!=value)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
