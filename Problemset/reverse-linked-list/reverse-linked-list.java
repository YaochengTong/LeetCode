
// @Title: 反转链表 (Reverse Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-30 19:52:56
// @Runtime: 0 ms
// @Memory: 38.8 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // recursive
        if (head == null || head.next == null) { return head; }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
