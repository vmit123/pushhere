class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        main.push(value);
        if(min.isEmpty() || value<=min.peek()){
            min.push(value);
        }
    } 
    
    public void pop() {
        if(main.isEmpty())return;
        if(main.peek().equals(min.peek())) {
            min.pop();
        }
        main.pop();
    }
    
    public int top() {
        return (main.isEmpty() ? -1:main.peek());
    }
    
    public int getMin() {
        if(min.isEmpty())return -1;
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */