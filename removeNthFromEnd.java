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
        // create a dummy node for the new list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // initialize pointers at head
        ListNode slow = head;
        ListNode fast = head;
      
        // move the fast pointer
        for(int i = 0; i <= n; i++){
            if(fast == null){
                // when the node that need to be delete is equal to the length of the list
                if(i == n){
                    dummy.next = head.next;
                }
                return dummy.next;
            }
            fast = fast.next;
        }

        // move two pointers while fast is not null
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

      // connect the nodes
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
