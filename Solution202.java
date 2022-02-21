class Solution {
    public String removeDuplicates(String s) 
    {
      Stack<Character> st= new Stack<>();
        char[] arr=s.toCharArray();
        int n=arr.length-1;
        st.push(arr[n]);
        for(int i=n-1;i>=0;i--)
        {   
            if(!st.isEmpty()&&st.peek()==arr[i])
                st.pop();
            else
                st.push(arr[i]);
        }
        char[] ans= new char[st.size()];
        int count=0;
        while(!st.isEmpty())
            ans[count++]=st.pop();
        return new String(ans);
    }
}
