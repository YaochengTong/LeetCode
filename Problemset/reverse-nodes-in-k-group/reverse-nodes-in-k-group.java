
// @Title: K 个一组翻转链表 (Reverse Nodes in k-Group)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-07 04:30:25
// @Runtime: 0 ms
// @Memory: 38.5 MB

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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            ListNode start = curr.next;
            ListNode tail = getTailNode(start, k);
            if (tail == null) { break; }
            ListNode next = tail.next;
            curr.next = reverseToNextNode(start, next);
            start.next = next;
            curr = start;
        }
        return dummy.next;
    }

    public ListNode reverseToNextNode(ListNode head, ListNode next) {
        ListNode prev = next;
        while (head != next) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public ListNode getTailNode(ListNode head, int k) {
        while (k > 1) {
            if (head == null) { return null; }
            head = head.next;
            k--;
        }
        return head;
    }

}
