
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     int [] arr={1,2,2,3,3,4};
   
     int count=0;
     int k=5;
     HashMap<Integer,Integer> map= new HashMap<>();
     for(int ele:arr)
     map.put(ele,map.getOrDefault(ele,0)+1);
     int [] ans=new int[map.size()];
     int i=0;
     for(int ele:map.keySet())
         ans[i++]=ele;
           
    Arrays.sort(ans); 
    //System.out.println(Arrays.toString(ans));
     int p1=0,p2=ans.length-1;
     
     //System.out.print(map);  
     while(p1<p2)
     {
         if(ans[p1]+ans[p2]==k)
         {
            if(map.get(ans[p1])==map.get(ans[p2]))
             count+=1;
            else
            count+=(map.get(ans[p1]));
            count+=map.get(ans[p2]);
            //System.out.println(map.get(ans[p1]));
            p1++;
            p2--;
           //   System.out.println(count);
            
            
         }
         
         else if(ans[p1]+ans[p2]>k)
         p2--;
         else if(ans[p1]+ans[p2]<k)
         p1++;
     }
   System.out.println(count);
    }
}
