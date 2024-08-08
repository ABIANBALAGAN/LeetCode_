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
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode p = slow;
        ListNode q = null;
        ListNode r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }

        // Step 3: Compare the first half and the reversed second half
        ListNode left = q; // q now points to the head of the reversed second half
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
