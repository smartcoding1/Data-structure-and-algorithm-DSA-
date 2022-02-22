class Solution {
    public int calPoints(String[] ops) 
    {
     Stack<Integer> st= new Stack<>();
     for(int i=0;i<ops.length;i++)
     {
          if(ops[i].equals("C"))
             st.pop();
         else if(ops[i].equals("+"))
         {
             int a=st.pop();
             int b=st.pop();
             int c=a+b;
             st.push(b);
             st.push(a);
             st.push(c);
         }
         else if(ops[i].equals("D"))
         {
             int a=st.peek();
                 st.push(2*a);
         }
         else
          st.push(Integer.parseInt(ops[i]));

     }  
        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}
