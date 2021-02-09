
// @Title: 两两交换链表中的节点 (Swap Nodes in Pairs)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-05 19:47:35
// @Runtime: 0 ms
// @Memory: 35.9 MB

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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            ListNode p1 = curr.next;
            ListNode p2 = curr.next.next;
            curr.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            curr = p1;
        }
        return dummy.next;
    }
}
