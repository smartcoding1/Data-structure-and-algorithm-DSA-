class Solution {
    public int balancedStringSplit(String s)
    {
        char[] arr= s.toCharArray();
        int count=1;
        char ch=s.charAt(0);
        int res=0;
        for(int i=1;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0 && i<s.length()-1){
                res++;
                i++;
                ch=s.charAt(i);
                count++;
            }
        }
        return res+1;
    }
}
