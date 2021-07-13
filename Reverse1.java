public class Reverse1
{
   static int [] reverseArray(int x[])
  {   int size=x.length;
      
      for(int i=0;i<size/2;i++)
      {   int tem= x[i];
           x[i]=x[size-1-i];
           x[size-1-i]=tem;
      }
      return x;
  }  
  public static void main(String...arg){
      
      
      for(int a:reverseArray(new int[]{3,4,5,6,9,0}))
      System.out.print(a);
  }
}
