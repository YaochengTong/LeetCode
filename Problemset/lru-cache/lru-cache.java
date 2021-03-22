
// @Title: LRU 缓存机制 (LRU Cache)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-21 11:11:26
// @Runtime: 22 ms
// @Memory: 46.5 MB

class LRUCache {

    private final HashMap<Integer, Node> map;
    private final MyLinkedList cache;
    private final int capacity;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        cache = new MyLinkedList();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            put(key, map.get(key).next.val);
            return cache.tail.val;
        } else { return -1; }
    }

    public void put(int key, int value) {
        Node temp = new Node(key, value);
        if (map.containsKey(key)) {
            Node prev = map.get(key);
            if (prev.next != cache.tail) {
                map.put(prev.next.next.key, prev);
            } else {
                cache.deleteUsingPrev(prev);
                cache.addTail(temp);
                return;
            }
            map.put(key, cache.tail);
            cache.deleteUsingPrev(prev);
        } else {
            if (map.size() == capacity) {
                map.remove(cache.head.key);
                if (cache.head.next == null) {
                    map.put(key, cache.dummy);
                    cache.deleteUsingPrev(cache.dummy);
                    cache.addTail(temp);
                    return;
                }
                map.put(cache.head.next.key, cache.dummy);
                cache.deleteUsingPrev(cache.dummy);
            }
            map.put(key, cache.tail);
        }
        cache.addTail(temp);
    }

}

class MyLinkedList {

    Node head, tail, dummy;
    public int size;

    public MyLinkedList() {
        this.dummy = new Node(0, 0);
        tail = dummy;
    }


    public void addTail(Node n) {
        tail.next = n;
        tail = n;
        size++;
        if (size == 1) { head = n; }
    }

    public void deleteUsingPrev(Node n_prev) {
        if (n_prev.next == tail) {
            n_prev.next = null;
            tail = n_prev;
        } else {
            n_prev.next = n_prev.next.next;
        }
        if (n_prev == dummy) { head = dummy.next; }
        size--;
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
