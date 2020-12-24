
// @Title: 填充每个节点的下一个右侧节点指针 II (Populating Next Right Pointers in Each Node II)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-21 19:52:28
// @Runtime: 0 ms
// @Memory: 38.4 MB

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node r) {
        if (r == null || r.right == null && r.left == null) { return r; }
        if (r.left == null) {
            r.right.next = findNextChildNode(r);
            r.right = connect(r.right);
        } else if (r.right == null) {
            r.left.next = findNextChildNode(r);
            r.left = connect(r.left);
        } else {
            r.left.next = r.right;
            r.right.next = findNextChildNode(r);
            r.right = connect(r.right);
            r.left = connect(r.left);
        }
        return r;
    }

    private Node findNextChildNode(Node p) {
        while (p.next != null) {
            if (p.next.left != null) { return p.next.left; }
            if (p.next.right != null) { return p.next.right; }
            p = p.next;
        }
        return null;
    }

}
