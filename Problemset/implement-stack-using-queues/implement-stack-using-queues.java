
// @Title: 用队列实现栈 (Implement Stack using Queues)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-17 14:56:15
// @Runtime: 0 ms
// @Memory: 36.2 MB

class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> a;
    Queue<Integer> b;

    public MyStack() {
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        b.add(x);
        while (!a.isEmpty()) {
            b.add(a.remove());
        }
        Queue<Integer> temp = a;
        a = b;
        b = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return a.remove();
    }

    /** Get the top element. */
    public int top() {
        return a.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return a.isEmpty();
    }

}

