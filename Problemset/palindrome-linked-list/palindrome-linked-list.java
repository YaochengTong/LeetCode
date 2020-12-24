
// @Title: 回文链表 (Palindrome Linked List)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-23 13:51:24
// @Runtime: 1 ms
// @Memory: 41 MB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) { return true; }
        ListNode curr = head;
        int length = 0;

        while(curr!=null) {
            curr = curr.next;
            length++;
        }

        // 中心点
        ListNode mid = head;
        ListNode mark = new ListNode();
        int middle = (length)/2-1;

        for(int i=0; i< middle;i++) {
            mid = mid.next;
        }
        if (length %2 ==0) {
            mark = mid.next;
        } else {
            mark = mid.next.next;
        }
        mid.next = null;

        reverse(head);


        while (mid !=null) {
            if (mid.val!=mark.val) { return false;}
            mid = mid.next;
            mark = mark.next;
        }
        

        return true;



    }

    private void reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
    }

}
