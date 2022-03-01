class MinStack {
Stack<Integer> stack = new Stack(); // Normal Stack
Stack<Integer> minStack = new Stack();// Keeps the current min on top 


public MinStack() {
    
}

public void push(int val) {

    // First time insert. If new min found add to minStack
    if(minStack.isEmpty() || val <=minStack.peek())
    {
        minStack.push(val);
    }
    
    stack.push(val);
}


public void pop() {
    // Pop from minStack only if top elements are same in both stacks
    if(stack.peek().equals(minStack.peek()))
    {
        minStack.pop();
    }
    stack.pop();
    
    
}

public int top() {
   return stack.peek();
}

public int getMin() {
   return minStack.peek();
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
