class Solution {
    public boolean isPalindrome(int x)
    {  
            if(x<0)
            return false;
      int tem=x;  
      int ans=0;
        while(x!=0)
        {
            ans=ans*10+x%10;
            x=x/10;
        }
        System.out.print(ans);
        if(ans!=tem)
            return false;
        else
            return true;
    }
}
