public class Solution {
    public int solve(int[] A, int B) 
    { 
        Arrays.sort(A);
        int min=Integer.MAX_VALUE;
        int n=A.length;
        int i=0,j=B-1,diff=0;
        if(B==0||A.length==0)
        return 0;
        while(j<n)
        {
            diff=A[j]-A[i];
            min=Math.min(min,diff);
            i++;
            j++;
        }
        return min;
    }
}
