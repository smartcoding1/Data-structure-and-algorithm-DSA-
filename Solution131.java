class Solution {
    public char findTheDifference(String s, String t)
    {
      char[] arr1=s.toCharArray();
      char[] arr2=t.toCharArray();
        int i=0,j=0,tem=0;
       while(i<arr1.length)
        { 
           tem^=(int)(arr1[i]-'a');
           i++;
        }
        while(j<arr2.length)
        {
            tem^=(int)arr2[j]-'a';
            j++;
        }
        System.out.print(tem);
      
        return (char)(tem+'a');
    }
}
