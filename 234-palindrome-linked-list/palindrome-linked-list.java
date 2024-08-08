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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
           return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        ListNode p = slow;
        ListNode q = null;
        ListNode r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        ListNode left = q; 
        for (int i = 0; i < count; i++) {
            if (left.val != head.val) {
                return false;
            }
            left = left.next;
            head = head.next;
        }

        return true;
    }
}
