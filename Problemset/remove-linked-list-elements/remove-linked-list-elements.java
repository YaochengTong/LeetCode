
// @Title: 移除链表元素 (Remove Linked List Elements)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-31 01:25:46
// @Runtime: 1 ms
// @Memory: 40.1 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) { return null; }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
