public class Test {

   public static int [] selectionSort(int x[])

    {   int size=x.length;
        for(int i=0;i<=size-2;i++)
        {
            for( int j=i+1;j<=size-1;j++)
            {
                if(x[i]>x[j])
                {
                    int tem=x[i];
                    x[i]=x[j];
                    x[j]=tem;
                }

            }
        } return x;
    }
    public static void main(String args[])
    {

      int []a=selectionSort(new int[] {5,6,1,7,2,9});
      for( int t: a )
      {
          System.out.println(t);
      }

