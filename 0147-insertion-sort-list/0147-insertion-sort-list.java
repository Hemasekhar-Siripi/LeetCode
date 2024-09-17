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
   // Method to sort the linked list using insertion sort
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // List is already sorted
        }

        // Create a new dummy head for the sorted list
        ListNode sortedHead = new ListNode(0);
        
        // Traverse the original list
        ListNode current = head;
        while (current != null) {
            // For each node, insert it into the sorted part
            ListNode prev = sortedHead;
            ListNode next = sortedHead.next;

            // Find the correct position for the current node
            while (next != null && next.val < current.val) {
                prev = next;
                next = next.next;
            }
            
            // Insert current node into the sorted list
            ListNode temp = current.next; // Save the next node
            current.next = next;
            prev.next = current;
            current = temp; // Move to the next node in the original list
        }

        return sortedHead.next; // Return the sorted list, skipping the dummy head
    }
    
}