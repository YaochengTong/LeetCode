
// @Title: 删除链表的倒数第N个节点 (Remove Nth Node From End of List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-28 23:21:40
// @Runtime: 0 ms
// @Memory: 36.3 MB

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next == null) { return null;}
        ListNode curr = head;
        for (int i = 0; i < n; i++) { curr = curr.next; }
        if(curr == null) { return head = head.next; }
         // two pointer start
        ListNode curr2 = head;
        while(curr.next != null ) {
           // System.out.println("value" + curr.val+" "+ curr2.val);
            curr = curr.next;
            curr2 = curr2.next;
        }
        curr2.next = curr2.next.next;
        return head;
    }
}
