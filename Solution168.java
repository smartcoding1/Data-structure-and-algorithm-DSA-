class Solution {
    public int maxLengthBetweenEqualCharacters(String s) 
    {  
        int count=-1;
       HashMap<Character,Integer> map= new HashMap<>();
       char[] arr= s.toCharArray();
       for(int i=0;i<arr.length;i++)
       {
           if(!map.containsKey(arr[i]))
               map.put(arr[i],i);
           else{
               int idx=map.get(arr[i]);
               count=Math.max(count,i-idx-1);
           }
           
       }
        return count;
    }  
}
