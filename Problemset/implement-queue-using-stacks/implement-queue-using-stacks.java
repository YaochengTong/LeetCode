
// @Title: 用栈实现队列 (Implement Queue using Stacks)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-04 20:09:12
// @Runtime: 0 ms
// @Memory: N/A

class MyQueue {

    /** Initialize your data structure here. */
    static Stack<Integer> a; 
    static Stack<Integer> b;
    
    public MyQueue() {
        a = new Stack<Integer>();  
        b = new Stack<Integer>();     
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!a.empty()){
            b.push(a.pop());
        }
        a.push(x);
        
        while(!b.empty()){
            a.push(b.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       return a.pop();
        
    }
    
    /** Get the front element. */
    public int peek() {
        return a.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.empty();
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
