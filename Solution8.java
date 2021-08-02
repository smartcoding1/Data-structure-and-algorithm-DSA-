class Solution8
{
    public int[][] flipAndInvertImage(int[][] image)
    {   
        int r=image.length;
        int c=image[0].length;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {   int n=c-1;
            for(int j=0;j<c;j++)
            {
                arr[i][n]=image[i][j];
                n--;
            }
        }
        for(int i=0;i<r;i++)
        {   
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==0)
                    arr[i][j]=1;
                else
                    arr[i][j]=0;
                
            }
        }
        return arr;
    }
}
