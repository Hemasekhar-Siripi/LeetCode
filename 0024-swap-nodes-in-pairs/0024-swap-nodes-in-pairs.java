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
    public ListNode swapPairs(ListNode head) {
        // Base case: If the list is empty or has only one node, return the head as it is
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize the pointers
        ListNode dummy = new ListNode(-1);  // Dummy node to simplify the head swap
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            // Identify the nodes to be swapped
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // Perform the swap
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // Move the pointer for the next swap
            prev = first;
        }
        
        return dummy.next; // The new head of the list
        
    }
}