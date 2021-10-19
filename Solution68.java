class Solution {
    public int[] shortestToChar(String s, char c) 
    {
        int[] arr= new int[s.length()];
        Arrays.fill(arr,Integer.MAX_VALUE);
        int pos=-1,tem=-1;
        for(int i=0;i<arr.length;i++)
        {   
            
            if(s.charAt(i)==c)
            {
                pos=i;
                 tem=i;
            }   
            if(pos!=-1)
            {
                arr[i]=i-pos;
            }
        }
        pos=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
                pos=i;
            if(pos!=-1)
            {
                arr[i]=Math.min(arr[i],pos-i);
            }
        }
       
        return arr;
    }   
}v
