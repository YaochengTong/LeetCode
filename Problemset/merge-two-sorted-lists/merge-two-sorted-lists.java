
// @Title: 合并两个有序链表 (Merge Two Sorted Lists)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-26 18:50:51
// @Runtime: 0 ms
// @Memory: 37.8 MB

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null || l2==null) { return l1 == null ? l2:l1; }
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(l1!=null && l2!=null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) { curr.next = l2; }
        if (l2 == null) { curr.next = l1; }
        return dummy.next;
    }
}
