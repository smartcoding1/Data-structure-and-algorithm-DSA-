class Solution {
    public String reverseWords(String s)
    {
       String[] arr= s.split(" ");
       for(int i=0;i<arr.length;i++)
       {
           String ans=arr[i];
           char[] arr2=ans.toCharArray();
           int p1=0;
           int p2=arr2.length-1;
           while(p1<p2)
           {
               char tem=arr2[p1];
               arr2[p1]=arr2[p2];
               arr2[p2]=tem;
               p1++;
               p2--;
           }
           arr[i]= new String(arr2);
           System.out.println(Arrays.toString(arr2));
       }
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {   
            count++;
            sb.append(arr[i]);
            if(count!=arr.length)
            sb.append(" ");
        }
        return sb.toString();
    }
}
