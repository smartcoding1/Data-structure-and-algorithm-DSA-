class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
       Arrays.sort(arr);
       int diff=arr[1]-arr[0];
        System.out.println(diff);
       for(int i=0;i<arr.length-1;i++)
       {
           if(arr[i+1]-arr[i]==diff)
               continue;
           else
               return false;
       }
        return true;
    }
}
