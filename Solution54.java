public class MyClass {
    public static void main(String args[]) {
     int rem=0,sum=0;
      int x=371;
      int tem=x;
      while(x!=0){
       rem=x%10;
        sum+=rem*rem*rem;
        x=x/10;
      }      
      if(sum==tem)
      System.out.println("is a armstrong number");
      else
      System.out.println("is not a armstrong number");
    }
}
