
// @Title: 合并K个升序链表 (Merge k Sorted Lists)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-27 02:16:45
// @Runtime: 1 ms
// @Memory: 40.2 MB

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

    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int low, int high) {
        if (low == high) { return lists[low]; }
        if (low > high) { return null; }
        int mid = low + (high - low) / 2;
        return mergeTwoListNodes(merge(lists, low, mid), merge(lists, mid + 1, high));
    }

    public ListNode mergeTwoListNodes(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a == null ? b : a);
        return dummy.next;
    }

}

