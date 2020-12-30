
// @Title: 环形链表 II (Linked List Cycle II)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-28 20:16:35
// @Runtime: 1 ms
// @Memory: 38.8 MB

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) { return null; }
        ListNode slow = head;
        ListNode quick = head.next;
        //int count = 0;
        while( quick.next!=null && quick.next.next!=null) {
            //System.out.println("step"+ count++ + "Node "+ slow.val+" "+ quick.val);
            if (slow == quick) {return secondRun(head, slow.next);}
            slow = slow.next;
            quick = quick.next.next;
        }
        return null;
    }

    public ListNode secondRun(ListNode head, ListNode meetPoint) {
        if (head == meetPoint) { return head; } 
        head = head.next; 
        meetPoint = meetPoint.next;
        return secondRun(head, meetPoint);
    }
}
