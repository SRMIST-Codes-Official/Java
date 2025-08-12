class MyQueue {
    Stack<Integer> s= new Stack<>();
    public MyQueue() {
        
    }
    public void push(int x) {
        s.push(x);
    }
    public int pop() {
        Stack<Integer> temp=new Stack<>();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        int removed= temp.pop();
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return removed;
    }
    public int peek() {
        Stack<Integer> temp=new Stack<>();
        while(!s.isEmpty()){
            temp.push(s.pop());
        }
        int peeked= temp.peek();
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return peeked;
    }
    public boolean empty() {
        return s.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */