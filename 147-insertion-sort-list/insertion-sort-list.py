# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def insertionSortList(self, head):
        # Dummy node for the sorted list
        dummy = ListNode(0)

        # Current node to be inserted
        current = head

        while current:
            prev = dummy
            next_node = current.next

            # Find the right place in the sorted list
            while prev.next and prev.next.val < current.val:
                prev = prev.next

            # Insert current between prev and prev.next
            current.next = prev.next
            prev.next = current

            # Move to the next node
            current = next_node

        return dummy.next

        