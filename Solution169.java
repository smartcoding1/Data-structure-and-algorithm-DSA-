class Solution {
    public int mostWordsFound(String[] sentences)
    {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<sentences.length;i++)
       {
           String s=sentences[i];
           String[] arr=s.split(" ");
           int count=arr.length;
           max=Math.max(max,count);
       }
        return max;
    }
}
