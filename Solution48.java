class Solution {
    public int[] kWeakestRows(int[][] mat, int k) 
    {
        int[] ans= new int[k];
        int[] count=new int[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                    count[i]++;
            }
        }
        int ind=0;
        while(k>0)
        {
            
            int minidx=0;
            for(int i=0;i<count.length;i++)
            {
                if(count[i]<count[minidx])
                    minidx=i;
            }
            ans[ind]=minidx;
            ind++;
            count[minidx]=Integer.MAX_VALUE;
            k--;
        }
        return ans;
    }
}
