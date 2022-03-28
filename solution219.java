class Solution {
    public int longestPalindrome(String s)
    {
      if(s.length()==1)
          return 1;
      char[] arr= s.toCharArray();
      HashMap<Character,Integer> map= new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
        System.out.println(map);
        int len=0;
        int count=0;
        for(char ele:map.keySet())
        {
            int tem=map.get(ele);
            if(tem%2==0){
                len+=tem;
                map.put(ele,0);}
            if(tem>2 && tem%2==1)
            {
                len+=tem-1;
                map.put(ele,1);
            }
        }
        if(map.containsValue(1))
            len+=1;
        System.out.println(len);
        return len;
    }
    
}
