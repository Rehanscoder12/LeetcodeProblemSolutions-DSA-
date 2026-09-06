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
    public ListNode modifiedList(int[] nums, ListNode head) {
        //  ListNode slow=head.next;
        // ListNode detect=head;
        HashSet<Integer>set =new HashSet<>();
        for(int x : nums){
            set.add(x);
        }

             while (head != null && set.contains(head.val)) { head = head.next; }
             if (head == null) { return null; }
              ListNode slow=head.next;
               ListNode detect=head;
             while(slow!=null){
           
                 if(set.contains(slow.val)){
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