class Solution {
    public String firstPalindrome(String[] words)
    {
      int n= words.length;
        for(int i=0;i<n;i++)
        {
            String s=words[i];
            int p1=0,p2=s.length()-1;
            boolean flag=true;
            while(p1<=p2)
            {   
                
                if(s.charAt(p1)!=s.charAt(p2)){
                    flag=false;
                    break;
                }
                p1++;
                p2--;
            }
            if(flag==true)
                return s;
        }
        return "";
    }
}
