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
    public ListNode rotateRight(ListNode head, int k) {
        int len=0;
        ListNode first=head,dummy=null,temp=null;
        if(head==null||head.next==null){
            return head;
        }
        while(head!=null){
            temp=head;
            head=head.next;
            len++;
        }
       k=k%len;
       int move=len-k;
       temp.next=first;
    for(int i=1;i<move;i++){
        first=first.next;
    }
            dummy=first.next;
            first.next=null;
        
    
    return dummy;

    }
}