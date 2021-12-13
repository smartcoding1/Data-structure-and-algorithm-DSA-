class Solution {
    public String reversePrefix(String word, char ch) 
    {
      char[] arr=word.toCharArray();
        int st=0,en=0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]==ch)
          {
              en=i;
              break;
          }    
         
      }
        System.out.print(en);
      return reverse(st,en,arr);
    }
    String reverse(int a, int b, char[] arr)
    {
        int i=0,j=b;
        while(i<=b)
        {
            arr[i]=(char)(arr[i]+arr[b]-(arr[b]=arr[i]));
            i++;
            b--;
        }  
        return new String(arr);
    }
}
