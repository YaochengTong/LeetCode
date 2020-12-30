
// @Title: 奇偶链表 (Odd Even Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-31 04:19:47
// @Runtime: 0 ms
// @Memory: 38.3 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) { return head; }
        ListNode odd = head;
        ListNode eHead = head.next;
        ListNode even = eHead;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = eHead;
        return head;
    }
}
