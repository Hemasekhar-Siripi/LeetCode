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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null; // Empty list, nothing to remove
        }

        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        seen.add(current.val);  // Add the first node's value to the set

        // Traverse the list
        while (current.next != null) {
            if (seen.contains(current.next.val)) {
                // If the value is already in the set, skip the next node
                current.next = current.next.next;
            } else {
                // If the value is not in the set, add it and move forward
                seen.add(current.next.val);
                current = current.next;
            }
        }
        return head;  // Return the head of the modified list
    }
}
