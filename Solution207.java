class Solution {
    public int minOperations(String[] logs)
    {
      Stack<String> stack= new Stack<>();
      for(int i=0;i<logs.length;i++)
      {
          if(logs[i].equals("../")&& !stack.isEmpty())
              stack.pop();
          else if(logs[i].equals("./"))
              continue;
           else if(logs[i].equals("../"))
               continue;
          else
              stack.push(logs[i]);
      }
        System.out.println(stack);
      return stack.size();  
    }
}
