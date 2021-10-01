class Solution {
    public void rotate(int[][] matrix) 
    {
        for(int i=0;i<matrix.length;i++)
            {
                for(int j=i;j<matrix[0].length;j++)
                {
                   matrix[i][j]=matrix[i][j]+matrix[j][i]-(matrix[j][i]=matrix[i][j]);
                }
            }
        for(int i=0;i<matrix.length;i++)
        {
            int p1=0;
            int p2=matrix.length-1;
                while(p1<p2)
                {
                  matrix[i][p1]=matrix[i][p1]+matrix[i][p2]-(matrix[i][p2]=matrix[i][p1]);
                    p1++;
                    p2--;
                }
        }
    }
}
