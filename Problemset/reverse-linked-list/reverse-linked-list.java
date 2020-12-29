
// @Title: 反转链表 (Reverse Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-28 16:54:48
// @Runtime: 0 ms
// @Memory: 38.4 MB

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
        if (head == null || head.next == null) { return head; }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
