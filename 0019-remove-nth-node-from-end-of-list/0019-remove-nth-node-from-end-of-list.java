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
       ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize two pointers, both starting from the dummy node
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move the first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        
        // Move both first and second pointers together until first reaches the end
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        
        // Remove the nth node from the end by skipping it
        second.next = second.next.next;
        
        // Return the head of the modified list
        return dummy.next;
        
    }
}