class Solution {
    public boolean backspaceCompare(String s, String t)
    {
       Stack<Character> st1= new Stack<>();
       Stack<Character> st2= new Stack<>();
        char[] arr= s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(!st1.isEmpty()&&arr[i]=='#')
                st1.pop();
            else if(arr[i]!='#')
                st1.push(arr[i]);
        }
        char[] arr2= t.toCharArray();
        for(int i=0;i<arr2.length;i++)
        {
            if(!st2.isEmpty() && arr2[i]=='#')
                st2.pop();
            else if(arr2[i]!='#')
                st2.push(arr2[i]);
        }
         StringBuilder sb1= new StringBuilder();
         StringBuilder sb2= new StringBuilder();
        while(!st1.isEmpty())
            sb1.append(st1.pop());
        while(!st2.isEmpty())
            sb2.append(st2.pop());
        
        return sb1.toString().equals(sb2.toString());
        
        
    }
}
