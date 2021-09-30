class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List<Integer> ans= new ArrayList<>();
        int minr=0, minc=0,count=0;
        int maxr=matrix.length-1,maxc=matrix[0].length-1;
        int tl=matrix.length*matrix[0].length;
        while(count<tl){
        //upper row
        for(int i=minc,j=minr;i<=maxc && count<tl;i++)
        {
            ans.add(matrix[j][i]);
            count++;
        }
        minr++;
        //right row
         for(int i=minr,j=maxc;i<=maxr && count<tl;i++)
        {
            ans.add(matrix[i][j]);
            count++;
        }
        maxc--;
        //bottom row
         for(int i=maxc,j=maxr;i>=minc && count<tl;i--)
        {
            ans.add(matrix[j][i]);
            count++;
        }
        maxr--;
        //left row
         for(int i=maxr,j=minc;i>=minr && count<tl;i--)
        {
            ans.add(matrix[i][j]);
            count++;
        }
        minc++;
        }
        return ans;
    }
}
