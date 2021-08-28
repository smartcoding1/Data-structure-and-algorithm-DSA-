class Solution16 {
    public static int minMoves(int[] arr) 
    {
     int min=Integer.MAX_VALUE;
        int moves=0;
     for(int i=0;i<arr.length;i++)
     {
         min=Math.min(min,arr[i]);
     }
     for(int i=0;i<arr.length;i++)
     {   
        moves+=arr[i]-min;  
     }
        return moves;
}
}    
