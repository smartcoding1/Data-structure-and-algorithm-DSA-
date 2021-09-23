import java.util.*;
public class MyClass {
    public static void count(String s)
    {   
        HashMap<Character,Integer> map= new HashMap<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int a=map.get(arr[i]);
                int b=a+1;
                map.put(arr[i],b);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        
        char ch=s.charAt(0);
        for(Character key:map.keySet())
        {  
            if(map.get(key)>=map.get(ch))
            ch=key;
           
        }
         System.out.println(ch);
    }
    public static void main(String args[]) {
      
      count("aaashshbdbhffffftttttbdh");
    }
}
