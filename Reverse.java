public class MyClass 
{
   static int [] reverseArray(int x[])
  {   int size=x.length;
      int a[]=new int[size];
      for(int i=0;i<size;i++)
      {
         a[i]=x[size-1-i];
      }
      return a;
  }  
  public static void main(String...arg){
      
      
      for(int a:reverseArray(new int[]{3,4,5,6}))
      System.out.print(a);
  }
}
