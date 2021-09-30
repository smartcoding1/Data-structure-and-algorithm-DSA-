class Solution {
    public int diagonalSum(int[][] mat)
    {
        int ans=0;
        int p1=0,p2=0;
        while(p1<mat.length)
        {
            ans+=mat[p1][p2];
            p1++;
            p2++;
        }
        int p3=mat[0].length-1;
        int p4=0;
        while(p4<mat.length)
        {
            ans+=mat[p3][p4];
            p3--;
            p4++;
        }
        if(mat.length%2!=0)
        {
            int mid=mat.length/2;
             ans=ans-mat[mid][mid];
         } 
        return ans;
    }
    
}
