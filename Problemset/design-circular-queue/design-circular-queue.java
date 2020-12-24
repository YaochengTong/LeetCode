
// @Title: 设计循环队列 (Design Circular Queue)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-27 00:22:44
// @Runtime: 6 ms
// @Memory: 39.2 MB

class MyCircularQueue {

    public int[] queue;
    private int size;
    private int headIndex;
    private int tailIndex;
    private final int length;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.length = k;
        this.size = 0;
        this.headIndex = 0;
        this.tailIndex = -1;
        for (int i = 0; i < k; i++) { queue[i] = -1; }
    }

    public boolean enQueue(int value) {
        if (size >= length) { return false; }
        size++;
        if (tailIndex < length - 1) {
            tailIndex++;
        } else {
            tailIndex = 0;
        }
        queue[tailIndex] = value;
        return true;
    }

    public boolean deQueue() {
        if (size <= 0) { return false; }
        size--;
        queue[headIndex] = -1;
        if (headIndex >= length - 1) {
            headIndex = 0;
        } else {
            headIndex++;
        }
        return true;
    }

    public int Front() { return queue[headIndex]; }

    public int Rear() { return queue[tailIndex]; }

    public boolean isEmpty() { return this.size == 0; }

    public boolean isFull() { return this.size == queue.length; }


}
