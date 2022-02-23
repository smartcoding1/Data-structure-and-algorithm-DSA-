class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set= new HashSet<>();
        char[] ans=s.toCharArray();
        int max=Integer.MIN_VALUE;
        int j=0;
        if(ans.length==0)
            return 0;
        for(int i=0;i<ans.length;)
        {  
            
            if(!set.contains(ans[i])){
                set.add(ans[i]);
                max=Math.max(max,set.size());
                i++;
            }
            else
            {
                set.remove(ans[j++]);
            }
        }
        return max;
    }
}
