/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr1={2,5,7,9};
		int[] arr2={3,6,10,11,12};
		int[] ans= new int[arr1.length+arr2.length];
		int p1=0,p2=0,k=0;
		while(p1<arr1.length&&p2<arr2.length)
		{
		    if(arr1[p1]>arr2[p2])
		    {
		      ans[k++]=arr2[p2];
		      p2++;
		    }
		    else
		    {
		      ans[k++]=arr1[p1];
		      p1++; 
		    }
		}
		while(p1<arr1.length)
		{
		    ans[k++]=arr1[p1];
		    p1++;
		}
		while(p2<arr2.length)
		{
		    ans[k++]=arr2[p2];
		    p2++;
		}
		System.out.println(Arrays.toString(ans));
	}
}
