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
    public ListNode partition(ListNode head, int x) {
       
		    // create dummy nodes for the new lists
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

	    	// initialize pointers for the new lists
        ListNode prev1 = dummy1;
        ListNode prev2 = dummy2;

        // start from the head
        ListNode current = head;

        while(current != null){
            if(current.val < x){
                prev1.next = current;
                prev1 = current;
            }else{
                prev2.next = current;
                prev2 = current;
            }
			
            current = current.next;
        }
      
        prev2.next = null;
        
        // connect the lists together
        prev1.next = dummy2.next;
        
        return dummy1.next;

    }

}
