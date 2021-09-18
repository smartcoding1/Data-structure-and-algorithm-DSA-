public class Solution {
    public int solve(int[] A) {
    int i,a=Integer.MIN_VALUE;
    int n=A.length;
    for(i=0;i<n;i++)  if(A[i]>a) a=A[i];
     
    int b=Integer.MIN_VALUE;
    for(i=0;i<n;i++)  if(A[i]>b && A[i]!=a) b=A[i];
    
    if(b==Integer.MIN_VALUE) return 0;
    else return b%a; 
         
    }
}
