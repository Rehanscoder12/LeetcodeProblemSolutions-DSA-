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
    public ListNode removeElements(ListNode head, int n) {
        while (head != null && head.val == n) { head = head.next; }
       if(head==null) return null;
        ListNode slow=head.next;
        ListNode detect=head;
        if(head.val==n && head.next==null) return null;
        while(slow!=null){
           
           if(slow.val==n){
            detect.next=slow.next;
           }
           else{
             detect=slow;

           }
           slow=slow.next;
          
           


        }
        return head;
        
    }
}