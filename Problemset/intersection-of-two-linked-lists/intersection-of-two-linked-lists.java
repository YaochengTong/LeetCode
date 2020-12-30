
// @Title: 相交链表 (Intersection of Two Linked Lists)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-28 21:39:34
// @Runtime: 1 ms
// @Memory: 41.3 MB

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) { return null; }
        ListNode a = headA;
        ListNode b = headB;
        while (a != null && b != null) {
            // System.out.println("Value: " + a.val + " " + b.val);
            if (a == b) {return a;}
            a = a.next;
            b = b.next;
        }
        a = a == null ? headB : a.next;
        b = b == null ? headA : b.next;
        while (a != null && b != null) {
            // System.out.println("Value: " + a.val + " " + b.val);
            if (a == b) {return a;}
            a = a.next;
            b = b.next;
        }
        a = a == null ? headB : a.next;
        b = b == null ? headA : b.next;
        while (a != null && b != null) {
            // System.out.println("Value: " + a.val + " " + b.val);
            if (a == b) {return a;}
            a = a.next;
            b = b.next;
        }
        return null;
    }
    
}
