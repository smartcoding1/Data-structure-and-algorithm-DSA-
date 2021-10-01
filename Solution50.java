public class MyClass {
    public static void main(String args[])
    {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] ans=new int[arr[0].length][arr.length];
        int r=-1;
        int c=ans[0].length-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                ans[++r][c]=arr[i][j];
            }
            r=-1;
            c--;
        }
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
     }
}v
