# LeetCode provides the ListNode definition.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseBetween(self, head, left, right):
        if not head or left == right:
            return head

        dummy = ListNode(0, head)
        prev = dummy

        # Move prev to the node before "left"
        for _ in range(left - 1):
            prev = prev.next

        # In-place sublist reversal using head-insertion technique
        curr = prev.next
        for _ in range(right - left):
            temp = curr.next
            curr.next = temp.next
            temp.next = prev.next
            prev.next = temp

        return dummy.next
