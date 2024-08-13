
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;
        ListNode p = start;
        ListNode q = null;
        ListNode r = null;
        for (int i = 0; i <= right - left; i++) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        pre.next = q;
        start.next = p;
        return dummy.next;
    }
    }
