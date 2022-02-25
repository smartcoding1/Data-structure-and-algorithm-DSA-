class Solution {
    public String makeGood(String s)
    {
       
        Stack<Character> stack= new Stack<>();
        StringBuilder sb= new StringBuilder();
        char[] arr=s.toCharArray();
      
        for(int i=0;i<arr.length;i++)
        {  
            if(!stack.isEmpty() && Math.abs(stack.peek()-arr[i])==32)
                stack.pop();
            else
                stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            char tem1=stack.peek();
            sb.append(tem1);
            stack.pop();
           
        }
        return sb.reverse().toString();
    }
