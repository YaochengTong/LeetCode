
// @Title: 环形链表 (Linked List Cycle)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-28 16:25:29
// @Runtime: 0 ms
// @Memory: 38.5 MB

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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) { return false; }
        ListNode slow = head;
        ListNode quick = head.next;
        while(quick.next!=null && quick.next.next!=null) {
            if(slow == quick) { return true; } 
            slow = slow.next;
            quick = quick.next.next;
        }
        return false;
    }
}
