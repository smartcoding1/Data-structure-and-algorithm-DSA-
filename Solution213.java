class Solution {
    public int minAddToMakeValid(String s) 
    {
      Stack<Character> st= new Stack<>();
      char[] ans=s.toCharArray();
      for(char ele:ans)
      {
          if(!st.isEmpty()&& ele==')'&& st.peek()=='(')
              st.pop();
          else
              st.push(ele);
      }
        return st.size();
    }
}
