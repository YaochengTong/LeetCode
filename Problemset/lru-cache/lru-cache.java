
// @Title: LRU 缓存机制 (LRU Cache)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-14 19:20:56
// @Runtime: 20 ms
// @Memory: 46.1 MB

class LRUCache {

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final MyDoubleLinkedList cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        cache = new MyDoubleLinkedList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            int value = map.get(key).value;
            put(key, value);
            return value;
        }
    }

    public void put(int key, int value) {
        Node temp = new Node(key, value);
        if (map.containsKey(key)) {
            cache.delete(map.get(key));
        } else {

            if (map.size() >= capacity) {
                Node deleted = cache.delete(cache.tail);
                map.remove(deleted.key);
            }
        }
        cache.addHead(temp);
        map.put(key, temp);
    }

}

class MyDoubleLinkedList {

    public Node head;
    public Node tail;

    public MyDoubleLinkedList() { }

    public void addHead(Node n) {
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public Node delete(Node n) {
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
        return n;
    }

}

class Node {

    public int key, value;
    public Node next;
    public Node prev;

    public Node() {
        this.key = 0;
        this.value = 0;
    }

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

}

