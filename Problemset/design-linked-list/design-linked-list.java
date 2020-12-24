
// @Title: 设计链表 (Design Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-27 17:35:18
// @Runtime: 9 ms
// @Memory: 38.8 MB

class Node {
    
    int val;
    Node next;
    Node prev;
    
    Node(int val) {
        this.val = val;
    }
    
}

class MyLinkedList {
    
    int size;
    Node head;
    Node tail;
    
    public MyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head;
        int count = 0;
        while (count < index) {
            curr = curr.next;
            count++;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        if (size < 1) {
            Node newNode = new Node(val);
            head = newNode;
            tail = newNode;
            size++;
        } else {
            Node addHead = new Node(val);
            addHead.next = head;
            head.prev = addHead;
            head = addHead;
            size++;
        }
    }
    
    public void addAtTail(int val) {
        if (size < 1) {
            Node newNode = new Node(val);
            head = newNode;
            tail = newNode;
            size++;
        } else {
            Node addTail = new Node(val);
            addTail.prev = tail;
            tail.next = addTail;
            tail = addTail;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        } else if (index < 0) {
            index = 0;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            size++;
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(val);
            curr.next.prev = newNode;
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
        } else if (index == size) {
            tail = tail.prev;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }
    
}
