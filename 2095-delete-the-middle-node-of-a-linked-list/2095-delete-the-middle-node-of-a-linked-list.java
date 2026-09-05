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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode detect=slow;
        if(head.next==null) return null;
        while(fast!=null && fast.next!=null){
            detect=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
         detect.next=slow.next;
        return head;
        
    }
}