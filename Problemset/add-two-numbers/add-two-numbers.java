
// @Title: 两数相加 (Add Two Numbers)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-24 15:35:27
// @Runtime: 2 ms
// @Memory: 38.7 MB

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(0);
        ListNode sum = preHead;
        int digit = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + digit;
            // 判定
            if (temp < 10) {
                digit = 0;
                sum.next = new ListNode(temp);
            } else {
                digit = 1;
                sum.next = new ListNode(temp % 10);
            }
            // iterate through
            l1 = l1.next;
            l2 = l2.next;
            sum = sum.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                int temp = l2.val + digit;
                if (temp < 10) {
                    digit = 0;
                    sum.next = new ListNode(temp);
                } else {
                    digit = 1;
                    sum.next = new ListNode(temp % 10);
                }
                l2 = l2.next;
                sum = sum.next;
            }
        } else {
            while (l1 != null) {
                int temp = l1.val + digit;
                if (temp < 10) {
                    digit = 0;
                    sum.next = new ListNode(temp);
                } else {
                    digit = 1;
                    sum.next = new ListNode(temp % 10);
                }
                l1 = l1.next;
                sum = sum.next;
            }
        }
        if (digit == 1) { sum.next = new ListNode(1);}
        return preHead.next;
    }
}
