public class MyClass {
    public static void main(String args[])
    {
         int[][] A={{3,4},{5,6}};
         int[][] B={{3,3},{1,1}};
         int[][] pro= new int[2][2];
         for(int i=0;i<A.length;i++)
         {
             for(int j=0;j<B[0].length;j++)
             {
                 for(int k=0;k<A[0].length;k++)
                 {
                     pro[i][j]+=A[i][k]*B[k][j];
                 }
             }
         }
           for(int i=0;i<A.length;i++)
         {
             for(int j=0;j<B[0].length;j++)
             {
                 System.out.print(pro[i][j]+" ");
             }
             System.out.println("");
         }
       
    }
}
