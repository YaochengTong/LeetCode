
// @Title: LRU 缓存机制 (LRU Cache)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-20 08:00:08
// @Runtime: 22 ms
// @Memory: 46.3 MB

class LRUCache {

    private final HashMap<Integer, Node> map;
    private final DLinkedList cache;
    private final int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        cache = new DLinkedList();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key).val;
            put(key, val);
            return val;
        } else { return -1; }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            cache.delete(map.get(key));
        } else {
            if (map.size() == capacity) {
                int tailKey = cache.tail.key;
                cache.delete(cache.tail);
                map.remove(tailKey);
            }
        }
        Node temp = new Node(key, value);
        map.put(key, temp);
        cache.addHead(temp);
    }

}

class DLinkedList {

    Node head;
    Node tail;

    public DLinkedList() {}

    public void addHead(Node n) {
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void delete(Node n) {
        if (n == head && n == tail) {
            head = tail = null;
        } else if (n == head) {
            head = head.next;
            head.prev = null;
        } else if (n == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
    }

    public void printList() {
        System.out.println("list: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + "|" + curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }

}

class Node {

    public int key, val;
    Node prev, next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }

}


