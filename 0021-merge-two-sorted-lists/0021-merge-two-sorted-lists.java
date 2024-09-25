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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;  // Add l1 node to merged list
                l1 = l1.next;       // Move to the next node in l1
            } else {
                current.next = l2;  // Add l2 node to merged list
                l2 = l2.next;       // Move to the next node in l2
            }
            current = current.next; // Move current pointer forward
        }

        // If there are remaining nodes in l1 or l2, append them to the result
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the next node after the dummy (which is the actual merged list head)
        return dummy.next;
        
    }
}