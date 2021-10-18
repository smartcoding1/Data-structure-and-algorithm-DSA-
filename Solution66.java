class Solution {
    public String reversePrefix(String word, char ch) 
    {
     int p1=0,p2=0;
      char[] arr= word.toCharArray();
        for(int i=0;i<arr.length;i++)
        {     
            if(arr[i]==ch)
            {
                p2=i;
                break;
            }    
        }
        if(p2==0)
            return word;
        return reverse(arr,p1,p2);
    }
         String reverse(char[] ans,int p1,int p2)
        {
           while(p1<p2)
           {
               char tem=ans[p1];
               ans[p1]=ans[p2];
               ans[p2]=tem;
               p1++;
               p2--;
           }
           return new String(ans);
        }
    
}
