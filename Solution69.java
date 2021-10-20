class Solution {
    public String reverseOnlyLetters(String s) 
    {
     char[] arr= s.toCharArray();
     int p1=0,p2=arr.length-1;
     while(p1<p2)
     {
         if(Character.isLetter(arr[p1])&&Character.isLetter(arr[p2]))
         {
             char tem=arr[p1];
             arr[p1]=arr[p2];
             arr[p2]=tem;
             p1++;
             p2--;
         }
         if(!Character.isLetter(arr[p1]))
             p1++;
         if(!Character.isLetter(arr[p2])) 
             p2--;
       
     }
       return new String(arr);   
    }
}
