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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy node to build the result linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;  // To store carry from each addition

        // Loop until both lists are fully traversed and there's no carry left
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values of the current nodes, or 0 if the node is null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the two digits and the carry
            int sum = x + y + carry;

            // Update the carry (1 if the sum is 10 or more, 0 otherwise)
            carry = sum / 10;

            // Create a new node with the digit value (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the next node of the dummy (which is the actual result head)
        return dummy.next;
    
    }
}