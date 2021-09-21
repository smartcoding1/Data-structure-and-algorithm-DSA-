import java.util.*;
public class Solution {
    public static int[] solve(int[] A) 
    {
        
       // ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {  
            int ind=-1;
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            for(int j=i;j<A.length;j++)
            {
              min1=Math.min(min1,A[j]);
              if(min1!=min2)
              {
                  ind=j;
                  min2=min1;
              }
            }
           // arr.add(ind);
            int tem= A[i];
            A[i]=A[ind];
            A[ind]=tem;
        }
      return A;
    }

    public static void main(String arr[])
    {
        int[] a={-3,-1,2,3,4,5,9,10};
        int[] arr1=solve(a);
        System.out.print(Arrays.toString(arr1));
    }
}
