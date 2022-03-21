class Solution {
    public int longestValidParentheses(String s) 
    {
       char[] arr=s.toCharArray();
       Stack<Integer> st=new Stack<>(); 
        st.push(-1);
        int max=0;
       for(int i=0;i<arr.length;i++)   
       {   if(arr[i]=='(')
             st.push(i);
           else
           {
               st.pop();
               if(!st.isEmpty())
                   max=Math.max(max,i-st.peek());
               else
                   st.push(i);
           }
       }
        return max;
    }
    
}
