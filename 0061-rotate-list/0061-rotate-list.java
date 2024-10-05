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
        if (head == null || head.next == null || k == 0) {
            return head;  // Base cases: if the list is empty, has one element, or no rotation needed
        }
        
        // Step 1: Calculate the length of the linked list
        ListNode current = head;
        int length = 1;  // Start with 1 because we are counting the head
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        // Step 2: Make the list circular
        current.next = head;  // Connect the last node to the head, making it a circular linked list
        
        // Step 3: Calculate the new tail position after k rotations
        k = k % length;  // If k is greater than length, we only need to rotate k % length times
        int stepsToNewTail = length - k;  // The new tail will be length - k steps from the beginning
        
        // Step 4: Find the new tail and break the circular list
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;  // Move the pointer to the new tail
        }
        
        ListNode newHead = newTail.next;  // The new head will be the node next to the new tail
        newTail.next = null;  // Break the circular link
        
        return newHead;  // Return the new head of the rotated list
        
        
    }
}